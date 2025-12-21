class Solution {
    public void nextPermutation(int[] nums) {
         int pivot=-1;
         for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]) {
                pivot =i;
                break;
            }
         }  
         if(pivot==-1){
            int i=0,j=nums.length-1;
            while(i<j){
                swap(nums,i,j);
                    i++;
                    j--;
                }
            
            return;
         } 
         for(int i=nums.length-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums,i,pivot);
                break;
            }
         }
         int k=pivot+1,l=nums.length-1;
         while(k<l){
            swap(nums,k,l);
            k++;
            l--;            
         }
    }
    public void swap(int nums[],int i,int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]= temp;
    }
}
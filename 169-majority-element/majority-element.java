class Solution {
    public int majorityElement(int[] nums) {
          Arrays.sort(nums);
          int count = 0;
          int n = nums.length/2;
          int arr[] = new int[nums.length];
          if(nums.length == 1){
            return nums[0];
          }
          for(int i=0;i<nums.length-1;i++){
             for(int j=1;j<nums.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                } else {
                    count = 0;
                }
                if(count >=n){
                    return nums[j];
                }
             }
          }
          return 0;
    }
}
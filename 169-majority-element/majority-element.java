class Solution {
    public int majorityElement(int[] nums) {
        int freq = 1;
        int n = nums.length/2;
        for(int i=0;i<nums.length-1;i++){
             for(int j=1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    freq = freq+1;
                }   
             }
             if(freq >n){
                return nums[i];
             }
             freq = 1;
        }
        return nums[0];
    }
}
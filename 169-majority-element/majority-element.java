class Solution {
    public int majorityElement(int[] nums) {
        int freq = 1;
        int n = nums.length/2;
        Arrays.sort(nums);
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                freq++;
            }else {
                freq = 1;ans=nums[i];
            }
            if(freq >n){
                return ans;
            }
        }
        return ans;
    }
}
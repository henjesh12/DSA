class Solution {
    public int[] twoSum(int[] nums, int target) {
        int add = 0;
        int result[] = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++) {
                add = nums[i]+nums[j];
                if(target == add){
                   result[0] = i;
                   result[1] = j;
                }
            }
        }
        return result;
    }
}
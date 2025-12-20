class Solution {
    public int[] twoSum(int[] nums, int target) {
       List list = new ArrayList();
       int arr[] = new int[2];
       for(int i=0;i<nums.length;i++){
       if(list.contains(target-nums[i])){
          int a = target-nums[i];
          arr[0]=i;
          arr[1]  = list.indexOf(a);
          return arr;
       }
         list.add(nums[i]);
       }
       return new int[]{-1,-1};
    }
}
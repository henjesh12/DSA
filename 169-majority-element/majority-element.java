class Solution {
    public int majorityElement(int[] nums) {
        int k=0, ans = 0;
        for(int val :nums){
            if(k==0){
                ans = val;
            }
            if(ans == val){
                k++;
            }else {
                k--;
            }
        } return ans;
    }
}
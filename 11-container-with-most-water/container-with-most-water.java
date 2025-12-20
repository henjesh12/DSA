class Solution {
    public int maxArea(int[] height) {
       int lp =0, rp = height.length-1, ans = 0;
       while (lp<rp){
          int width = rp-lp;
          int heigh = Math.min(height[lp],height[rp]);
          int curSum = width * heigh;
          ans = Math.max(curSum,ans);
          if (height[lp] < height[rp]) {
             lp++;
            } else {
              rp--;
          }

       }
       return ans;
    }
}
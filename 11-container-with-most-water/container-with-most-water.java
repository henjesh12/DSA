class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
  int h=0,w=0,Area=0,ans=0;
        while(i<=j){
           if(height[i]<height[j]){
             h=height[i];
             w=j-i;
             Area=h*w;
             i++;
           }else{
            h=height[j];
            w=j-i;
            Area=h*w;
            j--;
           }
           ans=Math.max(ans,Area);

        }
        return ans;
    }
}
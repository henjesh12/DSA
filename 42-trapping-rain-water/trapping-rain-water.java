class Solution {
    public int trap(int[] height) {
       int ans = 0;
       
       int lmax=0,rmax=0;
       int low=0,high=height.length-1;
       while(low<high){
        lmax= Math.max(lmax,height[low]);
        rmax=Math.max(rmax,height[high]);

        if(lmax<rmax){
            ans+= lmax-height[low];
            low++;
        }else{
            ans+=rmax-height[high];
            high--;
        }
       }
       return ans;
    }
}
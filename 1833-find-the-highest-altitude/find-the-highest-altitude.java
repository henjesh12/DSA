class Solution {
    public int largestAltitude(int[] gain) {
        int sum =0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<gain.length;i++){
            sum = sum+gain[i];
            if(max<sum){
                max = sum;
            }
        }
        if(max<0){
            return 0;
        }
                
            
        return max;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        int   buyStock = prices[0];
          int maxProfit =0;
          for(int val : prices){
            if(val >buyStock){
                maxProfit = Math.max(maxProfit ,(val - buyStock));
            }
            buyStock = Math.min(buyStock,val);
          }
          return maxProfit;
    }
}
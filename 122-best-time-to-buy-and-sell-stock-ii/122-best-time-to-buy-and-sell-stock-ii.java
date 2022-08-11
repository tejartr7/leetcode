class Solution {
    public int maxProfit(int[] prices) {
       
      int profit=0;
        int i;
        int l=prices.length;
        for(i=1;i<l;i++)
        {
            if(prices[i]>prices[i-1])
             profit+=prices[i]-prices[i-1];
        }
        return profit;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0];
       int max=0;
       int profit=0;
        //initially we set the starting price as minimum and max profit as zero
        //and current profit zero
        int i;
        int l=prices.length;
        for(i=1;i<l;i++)
        {   //update the minimum
            min=Math.min(prices[i],min);
            //check current profit
            profit=prices[i]-min;
            //update maximum profit
            max=Math.max(profit,max);
            
        }
        //return max profit
        return max;
    }
}
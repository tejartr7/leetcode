class Solution {
    public int maxProfit(int[] prices) {
       
        int len = prices.length;
        int profit = 0;        
        for(int i = 1; i < len; i++) {
            int todayPrice = prices[i];
            int yesterdayPrice = prices[i - 1];
            if(todayPrice > yesterdayPrice) 
                profit += todayPrice - yesterdayPrice;            
        }
        return profit;
    }
}
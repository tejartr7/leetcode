class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int i,j,n=coins.length;
        int dp[]=new int[amount+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(i=0;i<n;i++)
        {
            for(j=coins[i];j<=amount;j++)
            {
                if(dp[j-coins[i]]!=Integer.MAX_VALUE)
                {
                    dp[j]=Math.min(dp[j],1+dp[j-coins[i]]);
                }
            }
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}
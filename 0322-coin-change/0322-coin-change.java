class Solution {
    public int helper(int idx,int nums[],int amount,int dp[][])
    {
        if(idx==0)
        {
            if(amount%nums[idx]==0) return amount/nums[idx];
            return 1000000000;
        }
        else if(dp[idx][amount]!=-1) return dp[idx][amount];
        int notTake=helper(idx-1,nums,amount,dp);
        int take=Integer.MAX_VALUE;
        if(nums[idx]<=amount)
            take=1+helper(idx,nums,amount-nums[idx],dp);
        return dp[idx][amount]=Math.min(take,notTake);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int i,j,n=coins.length;
        int dp[][]=new int[n][amount+1];
        i=0;
        for(j=0;j<=amount;j++)
        {
            if(j%coins[0]==0)
                dp[0][j]=j/coins[0];
            else dp[0][j]=1000_000_000;
        }
        for(i=1;i<n;i++)
        {
            for(j=0;j<=amount;j++){
                int notTake=dp[i-1][j];
                int take=1000000000;
                if(coins[i]<=j)
                take=1+dp[i][j-coins[i]];
                dp[i][j]=Math.min(take,notTake);
            }
        }
        int x=dp[coins.length-1][amount];
        return x>=1000000000?-1:x;
    }
}
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
        int i,n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(i=0;i<n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
      
        int x=helper(coins.length-1,coins,amount,dp);
        return x>=1000000000?-1:x;
    }
}
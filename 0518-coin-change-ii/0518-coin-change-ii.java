class Solution {
    public int helper(int idx, int nums[], int amount, int dp[][]) {
    if (idx == 0) {
        if (amount % nums[idx] == 0)
            dp[idx][amount] = 1;
        else
            dp[idx][amount] = 0;
        return dp[idx][amount];
    } 
        if (dp[idx][amount] != -1)
            return dp[idx][amount];
        int not = helper(idx - 1, nums, amount, dp);
        int take = 0;
        if (amount >= nums[idx])
            take = helper(idx, nums, amount - nums[idx], dp);
        return dp[idx][amount] = take+not;
    }

    public int change(int amount, int[] coins) {
        int i,j,n=coins.length;
        int dp[][]=new int[n][amount+1];
        for(i=0;i<n;i++)
            Arrays.fill(dp[i],-1);
        return helper(n-1,coins,amount,dp);
    }
}
class Solution {
    public int climbStairs(int n) {
        long dp[]=new long[n+1];
        int i;
        dp[0]=1l;
        dp[1]=1l;
        for(i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return (int)dp[n];
    }
}
class Solution {
    public int minCostClimbingStairs(int[] c) {
        int dp[]=new int[c.length+1];
        int n=c.length;
        if(n<2)
            return 0;
        if(n==2)
            return Math.min(c[0],c[1]);
        int i;
        for(i=2;i<n+1;i++)
        {
            dp[i]=Math.min(dp[i-2]+c[i-2],dp[i-1]+c[i-1]);
        }
        return dp[n];
        
    }
}
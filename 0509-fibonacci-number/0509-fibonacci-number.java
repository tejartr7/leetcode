class Solution {
    public int fib(int n) {
       int dp[]=new int[n+1];
        if(n==0)
            return n;
        if(n==1 || n==2)
            return 1;
        dp[0]=1;
        dp[1]=dp[2]=1;
        for(int i=3;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}
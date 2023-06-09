class Solution {
    int mini=Integer.MAX_VALUE;
    public int minSteps(int n) {
        //helper(1,0,0,n);
        int dp[]=new int[n+1];
        Arrays.fill(dp,1000000);
        int i;
        dp[0]=dp[1]=0;
        for(i=2;i<=n;i++)
        {
            int x,y;
            for(x=2;x*x<=i;x++)
            {
                if(i%x==0)
                {
                    dp[i]=Math.min(dp[i],dp[i/x]+dp[x]);
                }
            }
            if(dp[i]==1000000)
            {//this mean that the number is a prime number
                dp[i]=i;
            }
        }
        return dp[n];
    }
}
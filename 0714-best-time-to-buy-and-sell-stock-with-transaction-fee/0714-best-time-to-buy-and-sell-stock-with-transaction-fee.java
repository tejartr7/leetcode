class Solution {
    public int helper(int i,int buy,int p[],int fee)
    {
        int ans=0;
        if(i>=p.length) return 0;
        if(buy==1)
        {
            ans=Math.max(-p[i]+helper(i+1,0,p,fee),helper(i+1,1,p,fee));
        }
        else
        {
            ans=Math.max(p[i]-fee+helper(i+1,1,p,fee),helper(i+1,0,p,fee));
        }
        return ans;
    }
    public int maxProfit(int[] p, int fee) {
        int n=p.length;
        int dp[][]=new int[n+1][2];
        int i,j;
        for(i=0;i<=n;i++)
            Arrays.fill(dp[i],-1);
        dp[n][0]=dp[n][1]=0;
        for(i=n-1;i>=0;i--)
        {   
            int ans=0;
            for(j=0;j<2;j++)
            {
               if(j==1)
               ans=Math.max(-p[i]+dp[i+1][0],dp[i+1][1]);
               else
               ans=Math.max(p[i]-fee+dp[i+1][1],dp[i+1][0]);
               dp[i][j]=ans;
            }
        }
        for(i=0;i<2;i++)
        {
            
        }
        return dp[0][1];
    }
}
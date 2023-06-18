class Solution {
    int maxi=0;
    public int helper(int ind,int b,int cap,int p[])
    {
        if(ind==p.length || cap==0) return 0;
        int profit=0;
        if(b==1)
        {
            profit=Math.max(-p[ind]+helper(ind+1,0,cap,p),helper(ind+1,1,cap,p));
        }
        else
        {
            profit=Math.max(p[ind]+helper(ind+1,1,cap-1,p),helper(ind+1,0,cap,p));
        }
        return profit;
    }
    public int maxProfit(int[] p) {
        int i,j;
        int n=p.length;
        int dp[][][]=new int[n+1][2][3];
        int c=0;
       
        for(i=n-1;i>=0;i--)
        {
            for(j=0;j<2;j++)
            {
                for(c=1;c<=2;c++)
                {
                   if(j==1)
                   dp[i][j][c]=Math.max(-p[i]+dp[i+1][0][c],dp[i+1][1][c]);
                   else
                   dp[i][j][c]=Math.max(p[i]+dp[i+1][1][c-1],dp[i+1][0][c]);    
                }
            }
        }
        return dp[0][1][2];
    }
}
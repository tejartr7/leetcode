class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        int i,j;
        //top down method of tabulation
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j && i==0)
                {
                    dp[i][j]=1;
                }
                else
                {
                    int a=0,b=0;
                    if(i>0)
                        a+=dp[i-1][j];
                    if(j>0)
                        b+=dp[i][j-1];
                    dp[i][j]=a+b;
                }
            }
        }
        return dp[m-1][n-1];
    }
}
class Solution {
    int mod=1000_000_007;
    public int countPaths(int[][] grid) {
        int i,j;
        int m=grid.length,n=grid[0].length;
        int path=0;
        int dp[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);    
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                path=(path+dfs(i,j,-1,dp,grid))%mod;
            }
        }
        return path;
    }
    public boolean valid(int i,int j,int m ,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public int dfs(int i,int j,int prev,int dp[][],int grid[][])
    {
        int m=grid.length,n=grid[0].length;
        if(!valid(i,j,m,n))
            return 0;
        if(prev>=grid[i][j])
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int l=dfs(i,j-1,grid[i][j],dp,grid);
        int r=dfs(i,j+1,grid[i][j],dp,grid);
        int u=dfs(i+1,j,grid[i][j],dp,grid);
        int d=dfs(i-1,j,grid[i][j],dp,grid);
        return dp[i][j]=(1+l+r+u+d)%mod;
    }
}
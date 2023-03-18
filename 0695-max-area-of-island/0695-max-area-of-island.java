class Solution {
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public void dfs(int i,int j,int []dp,boolean visited[][],int grid[][])
    {
        int m=grid.length,n=grid[0].length;
        if(!valid(i,j,m,n) || visited[i][j]) return ;
        if(grid[i][j]==1)
        {
            dp[0]++;
            visited[i][j]=true;
            dfs(i+1,j,dp,visited,grid);
            dfs(i-1,j,dp,visited,grid);
            dfs(i,j+1,dp,visited,grid);
            dfs(i,j-1,dp,visited,grid);
        }
    }
    public int maxAreaOfIsland(int[][] grid) {
        int i,j,m=grid.length,n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int maxi=0;
        for(i=0;i<m;i++)
        {
           for(j=0;j<n;j++)
           {
               if(grid[i][j]==0)
               {
                   visited[i][j]=true;
               }
               else if(grid[i][j]==1)
               {
                   int dp[]=new int[1];
                   dp[0]=0;
                   dfs(i,j,dp,visited,grid);
                   maxi=Math.max(maxi,dp[0]);
               }
           }
        }
        return maxi;
    }
}
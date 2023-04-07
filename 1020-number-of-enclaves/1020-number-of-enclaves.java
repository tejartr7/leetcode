class Solution {
    public boolean isValid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public void dfs(int i,int j,int grid[][])
    {
        int m=grid.length,n=grid[0].length;
        if(i >= 0 && i <= grid.length - 1 && j >= 0 && j <= grid[i].length - 1 && grid[i][j] == 1){
        grid[i][j]=0;
        dfs(i+1,j,grid);
        dfs(i-1,j,grid);
        dfs(i,j+1,grid);
        dfs(i,j-1,grid);
        }
    }
    public int numEnclaves(int[][] grid) {
        int i,j,m=grid.length,n=grid[0].length;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==m-1 || j==n-1)
                    dfs(i,j,grid);
            }
        }
        int count=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==1) count++;
            }
        }
        return count;
    }
}
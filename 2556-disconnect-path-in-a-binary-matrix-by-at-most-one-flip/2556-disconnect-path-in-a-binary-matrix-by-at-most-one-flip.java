class Solution {
    public boolean valid(int i,int j,int m,int n)
    {
        return i<m && j<n;
    }
    public boolean dfs(int grid[][],int i,int j)
    {
        int m=grid.length,n=grid[0].length;
        if(i==m-1 && j==n-1)
            return true;
        if(!valid(i,j,m,n)) return false;
        if(grid[i][j]==0) return false;
        grid[i][j]=0;
        return dfs(grid,i+1,j)||dfs(grid,i,j+1);
    }
    public boolean isPossibleToCutPath(int[][] grid) {
        if(!dfs(grid,0,0)) return true;
        grid[0][0]=1;
        if(!dfs(grid,0,0)) return true;
        return false;
    }
}
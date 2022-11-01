class Solution {
    public int dfs(int [][]grid,int i,int j)
    {
        if(i>=grid.length)
        return j;
        if(i<0 || j<0 || j>=grid[0].length)
        return -1;
        if(grid[i][j]==1)
        {
            if(j+1<grid[0].length && grid[i][j+1]==1)
            return dfs(grid,i+1,j+1);
            return -1;
        }
        else
        {
            if(j-1>=0 && grid[i][j-1]==-1)
            return dfs(grid,i+1,j-1);
            return -1;
        }
    }
    public int[] findBall(int[][] grid) {
        int n=grid[0].length;
        int ans[]=new int[n];
        int i;
        for(i=0;i<n;i++)
            ans[i]=dfs(grid,0,i);
        return ans;
    }
}
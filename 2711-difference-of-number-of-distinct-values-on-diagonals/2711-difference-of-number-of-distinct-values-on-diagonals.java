class Solution {
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0&& i<m && j>=0 && j<n;
    }
    public void checkT(int i,int j,int m,int n,Set<Integer> set,int grid[][])
    {
        if(!valid(i,j,m,n)) return ;
        set.add(grid[i][j]);
        checkT(i-1,j-1,m,n,set,grid);
    }
    public void checkB(int i,int j,int m,int n,Set<Integer> set,int grid[][])
    {
        if(!valid(i,j,m,n)) return ;
        set.add(grid[i][j]);
        checkB(i+1,j+1,m,n,set,grid);
    }
    public int[][] differenceOfDistinctValues(int[][] grid) {
        int i,j,m=grid.length,n=grid[0].length;
        int ans[][]=new int[m][n];
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                Set<Integer> top=new HashSet<>();
                Set<Integer> bottom=new HashSet<>();
                checkB(i+1,j+1,m,n,top,grid);
                checkT(i-1,j-1,m,n,bottom,grid);
                ans[i][j]=Math.abs(top.size()-bottom.size());
            }
        }
        return ans;
    }
}
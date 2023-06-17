class pair
{
    int x;
    int y;
    pair(int a,int b)
    {
        x=a;
        y=b;
    }
}
class Solution {
    boolean visited[][];
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public void dfs(int i,int j,boolean visited[][],List<pair> list,int grid[][])
    {
        int m=grid.length,n=grid[0].length;
        if(!valid(i,j,m,n) || visited[i][j]) return ;
        visited[i][j]=true;
        if(grid[i][j]==1)
        {
            list.add(new pair(i,j));
            dfs(i+1,j,visited,list,grid);
            dfs(i-1,j,visited,list,grid);
            dfs(i,j+1,visited,list,grid);
            dfs(i,j-1,visited,list,grid);
        }
    }
    public boolean helper(List<pair> list,int grid[][])
    {
        for(pair temp:list)
        {
            if(grid[temp.x][temp.y]==0)
                return false;
        }
        return true;
    }
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int i,j;
        int m=grid2.length,n=grid2[0].length;
        visited=new boolean[m][n];
        int cnt=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(!visited[i][j] && grid2[i][j]==1)
                {
                    List<pair> temp=new ArrayList<>();
                    dfs(i,j,visited,temp,grid2);
                    if(helper(temp,grid1))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}
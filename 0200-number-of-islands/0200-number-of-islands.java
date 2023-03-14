class pair
{
    int row;
    int col;
    pair(int row,int col)
    {
        this.row=row;
        this.col=col;
    }
}
class Solution {
    public boolean isValid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public void bfs(int r,int c,char [][]grid,boolean visited[][])
    {
        visited[r][c]=true;
        Queue<pair> q=new LinkedList<>();
        int m=grid.length,n=grid[0].length;
        q.offer(new pair(r,c));
        while(!q.isEmpty())
        {
            pair top=q.poll();
            int row=top.row;
            int col=top.col;
            if(isValid(row-1,col,m,n))
            {
                if(grid[row-1][col]=='1' &&!visited[row-1][col])
                {
                    visited[row-1][col]=true;
                    q.offer(new pair(row-1,col));
                }
            }
            if(isValid(row+1,col,m,n))
            {
                if(grid[row+1][col]=='1' &&!visited[row+1][col])
                {
                    visited[row+1][col]=true;
                    q.offer(new pair(row+1,col));
                }
            }
            if(isValid(row,col-1,m,n))
            {
                if(grid[row][col-1]=='1' &&!visited[row][col-1])
                {
                    visited[row][col-1]=true;
                    q.offer(new pair(row,col-1));
                }
            }
            if(isValid(row,col+1,m,n))
            {
                if(grid[row][col+1]=='1' &&!visited[row][col+1])
                {
                    visited[row][col+1]=true;
                    q.offer(new pair(row,col+1));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int i,j,m=grid.length,n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int count=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(!visited[i][j] && grid[i][j]=='1')
                {
                    count++;
                    bfs(i,j,grid,visited);
                }
            }
        }
        //System.out.println(x);
        return count;
    }
}
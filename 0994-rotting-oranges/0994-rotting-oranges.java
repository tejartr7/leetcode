class ds
{
    int row;
    int col;
    int time;
    ds(int row,int col,int time)
    {
        this.row=row;
        this.col=col;
        this.time=time;
    }
}
class Solution {
    public boolean isValid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public int orangesRotting(int[][] grid) {
        Queue<ds> q=new LinkedList<>();
        int i,j,m=grid.length,n=grid[0].length;
        int ans=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.offer(new ds(i,j,0));
                }
            }
        }
        while(!q.isEmpty())
        {
            ds top=q.poll();
            int time=top.time;
            ans=Math.max(ans,time);
            i=top.row;j=top.col;
            if(isValid(i+1,j,m,n) && grid[i+1][j]==1)
            {
                q.offer(new ds(i+1,j,time+1));
                grid[i+1][j]=2;
            }
            if(isValid(i-1,j,m,n) && grid[i-1][j]==1)
            {
                q.offer(new ds(i-1,j,time+1));
                grid[i-1][j]=2;
            }
            if(isValid(i,j-1,m,n) && grid[i][j-1]==1)
            {
                q.offer(new ds(i,j-1,time+1));
                grid[i][j-1]=2;
            }
            if(isValid(i,j+1,m,n) && grid[i][j+1]==1)
            {
                q.offer(new ds(i,j+1,time+1));
                grid[i][j+1]=2;
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return ans;
    }
}
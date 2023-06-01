class tuple
{
    int row;
    int col;
    int level;
    tuple(int row,int col,int level)
    {
        this.row=row;
        this.col=col;
        this.level=level;
    }
}
class Solution {
    //int mini=Integer.MAX_VALUE;
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public int shortestPathBinaryMatrix(int[][] grid) {
        int i,j,m=grid.length,n=grid[0].length;
        int mini=Integer.MAX_VALUE;
        Queue<tuple> q=new PriorityQueue<>((a,b)->a.level-b.level);
        if(grid[0][0]==1 || grid[m-1][n-1]==1) return -1;
        q.offer(new tuple(0,0,1));
        while(!q.isEmpty())
        {
            tuple top=q.poll();
            if(top.row==m-1 && top.col==n-1)
            {
                return top.level;
            }
            for(i=-1;i<=1;i++)
            {
                for(j=-1;j<=1;j++)
                {
                    int x=top.row+i;
                    int y=top.col+j;
                    if(i==0 && j==0) continue;
                    if(!valid(x,y,m,n)) continue;
                    if(grid[x][y]!=0) continue;
                    grid[x][y]=-1;
                    q.offer(new tuple(x,y,top.level+1));
                }
            }
        }
        return  mini==Integer.MAX_VALUE?-1:mini;
    }
}
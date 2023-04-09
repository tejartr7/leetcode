class pair
{
    int row;
    int col;
    pair(int a,int b)
    {
        row=a;
        col=b;
    }
}
class Solution {
    public int minimumVisitedCells(int[][] grid) {
        int i,j,k,m=grid.length,n=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        if(m==0 || n==0 || grid==null)
            return 0;
        if(m==1 && n==1)
            return 1;
        q.offer(new pair(0,0));
        boolean visited[][]=new boolean[m][n];
        int steps=1;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(i=0;i<size;i++)
            {
                pair top=q.poll();
                int x=top.row;
                int y=top.col;
                int rowMax=Math.min(m-1,x+grid[x][y]);
                int colMax=Math.min(n-1,y+grid[x][y]);
                for(k=x+1;k<=rowMax;k++)
                {
                    if(k==m-1 && y==n-1)
                        return steps+1;
                    if(grid[k][y]!=0 && !visited[k][y])
                    {
                        visited[k][y]=true;
                        q.offer(new pair(k,y));
                    }
                }
                for(k=y+1;k<=colMax;k++)
                {
                    if(x==m-1 && k==n-1)
                        return steps+1;
                    if(grid[x][k]!=0 && !visited[x][k])
                    {
                        visited[x][k]=true;
                        q.offer(new pair(x,k));
                    }
                }
            }
            steps++;
        }
        return -1;
    }
}
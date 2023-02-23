class Solution {
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public void dfs(int i,int j,char board[][])
    {
        int m=board.length,n=board[0].length;
        if(!valid(i,j,m,n)) return ;
        if(board[i][j]=='O')
        {
            board[i][j]='Z';
            dfs(i+1,j,board);
            dfs(i-1,j,board);
            dfs(i,j+1,board);
            dfs(i,j-1,board);
        }
    }
    public void solve(char[][] board) {
        int i,j,m=board.length,n=board[0].length;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||j==0||i==m-1||j==n-1)
                {
                    if(board[i][j]=='O')
                        dfs(i,j,board);
                }
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(board[i][j]=='Z')
                {
                    board[i][j]='O';
                }
                else
                    board[i][j]='X';
            }
        }
    }
}
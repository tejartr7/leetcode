class Solution {
    public boolean exist(char[][] board, String word) {
        int i,j,n1=board.length,n2=board[0].length;
        for(i=0;i<n1;i++)
        {
            for(j=0;j<n2;j++)
            {
                if(exists(board,i,j,word,0))
                return true;
            }
        }
        return false;
    }
    public boolean exists(char [][]board,int i,int j,String word,int ind)
    {
        if(ind>=word.length())
        return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)
        return false;
        char curr=board[i][j];
        if(curr=='.')
        return false;
        if(curr!=word.charAt(ind))
        return false;
        board[i][j]='.';
        boolean r=exists(board,i-1,j,word,ind+1)|| exists(board,i,j-1,word,ind+1) ||
        exists(board,i+1,j,word,ind+1)||exists(board,i,j+1,word,ind+1);
        board[i][j]=curr;
        return r;
    }
}
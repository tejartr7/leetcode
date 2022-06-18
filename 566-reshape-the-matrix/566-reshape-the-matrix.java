class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int l=mat.length;
        int l2=mat[0].length;
        if(l*l2!=r*c)
            return mat;
        int i,j;
        int a=0,b=0;
        int [][]s=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                if(b==l2)
                {
                    b=0;
                    a++;
                }
                s[i][j]=mat[a][b];
                b++;
            }
        }
        
            return s;
        
    }
}
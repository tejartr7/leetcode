class Solution {
    private void make(int aa[][],int x,int y)
    {
        int l=aa.length; 
        int b=aa[0].length;
        int i;
        for(i=0;i<l;i++)
        {
            aa[i][y]=0;
        }
        for(i=0;i<b;i++)
        {
            aa[x][i]=0;
        }
        
    }
  public void setZeroes(int[][] matrix) {
        int l=matrix.length; 
        int b=matrix[0].length;
        int i,j;
        int a[][]=new int[l][b];
        for(i=0;i<l;i++)
        {
            for(j=0;j<b;j++)
            {
                a[i][j]=matrix[i][j];
            }
        }
        for(i=0;i<l;i++)
        {
            for(j=0;j<b;j++)
            {
                if(a[i][j]==0)
                {
                    make(matrix,i,j);
            
                }
            }
        }
  }
}
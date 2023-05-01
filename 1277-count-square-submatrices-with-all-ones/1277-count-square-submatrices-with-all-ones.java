class Solution {
    public int countSquares(int[][] matrix) {
        int ans=0;
        int i,j,m=matrix.length,n=matrix[0].length;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]>0 && i>0 && j>0)
                matrix[i][j]=1+Math.min(matrix[i-1][j],Math.min(matrix[i][j-1],matrix[i-1][j-1]));
                ans+=matrix[i][j];
            }
        }
        return ans;
    }
}
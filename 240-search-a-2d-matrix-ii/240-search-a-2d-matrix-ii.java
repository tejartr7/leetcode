class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     int i,j;
        for(i=0;i<matrix.length;i++)
        {
            for(j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==target)
                {
                    return true;
                   
                }
            }
        }
        return false;
    }
}
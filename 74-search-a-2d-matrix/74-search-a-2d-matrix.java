class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i,j;
        int count=0;
        for(i=0;i<matrix.length;i++)
        {
        for(j=0;j<matrix[i].length;j++)
        {
            if(target==matrix[i][j])
            {   count++;
            break;
            }
        }
            }
        if(count==0)
            return false;
        else
            return true;
    }
}
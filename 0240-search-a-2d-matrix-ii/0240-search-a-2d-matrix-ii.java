class Solution {
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length,n=matrix[0].length;
        int i=0,j=n-1;
        while(valid(i,j,m,n))
        {
            if(matrix[i][j]>target)
            {
                j=j-1;
            }
            else if(matrix[i][j]==target)
                return true;
            else 
                i=i+1;
        }
        return false;
    }
}
class Solution {
    public int uniquePathsWithObstacles(int[][] A) {
        int n = A.length;
        int m = A[0].length;
        int [][] ans = new int[n][m];
        for(int i = 0;i<n;i++){
            if(A[i][0] == 0) ans[i][0] = 1;
            else break;
        }
        for(int j = 0;j<m;j++){
            if(A[0][j] == 0) ans[0][j] = 1;
            else break;
        }

        for(int i = 1;i<n;i++){
            for(int j = 1;j<m;j++){
                if(A[i][j]==0) ans[i][j] = ans[i-1][j]+ans[i][j-1];
            }
        }
        return ans[n-1][m-1];
    }
}
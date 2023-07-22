public class Solution {
    public double knightProbability(int n, int k, int row, int column) {
        int[][] dir = {{1,2},{-1,2},{1,-2},{-1,-2},{2,1},{-2,1},{2,-1},{-2,-1}};

        double[][][] dp = new double[k + 1][n][n];
        dp[0][row][column] = 1.0;
        int prevI;
        int prevJ;
        for (int m = 1; m <= k; m++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) { 
                    for (int[] d : dir) {
                        prevI = i - d[0];
                        prevJ = j - d[1];
                        if (prevI >= 0 && prevI < n && prevJ >= 0 && prevJ < n) {
                            dp[m][i][j] += dp[m - 1][prevI][prevJ] / 8.0;
                        }
                    }
                }
            }
        }

        double ans = 0.0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans += dp[k][i][j];
            }
        }
        return ans;
    }
}
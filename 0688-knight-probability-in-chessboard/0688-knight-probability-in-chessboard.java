class Solution {
    double a = 0;
    double[][][] memo;

    public boolean valid(int i, int j, int n) {
        return i >= 0 && i < n && j >= 0 && j < n;
    }

    public double dfs(int i, int j, int n, int k) {
        if (k == 0) {
            if (valid(i, j, n))
                return 1;
            return 0;
        }

        if (!valid(i, j, n))
            return 0;

        if (memo[i][j][k] != -1)
            return memo[i][j][k];

        double sum = 0;
        sum += dfs(i - 2, j + 1, n, k - 1);
        sum += dfs(i - 2, j - 1, n, k - 1);
        sum += dfs(i + 2, j + 1, n, k - 1);
        sum += dfs(i + 2, j - 1, n, k - 1);
        sum += dfs(i - 1, j + 2, n, k - 1);
        sum += dfs(i + 1, j + 2, n, k - 1);
        sum += dfs(i - 1, j - 2, n, k - 1);
        sum += dfs(i + 1, j - 2, n, k - 1);

        memo[i][j][k] = sum;
        return memo[i][j][k];
    }

    public double knightProbability(int n, int k, int row, int col) {
        double b = (double) Math.pow(8, k);
        memo = new double[n][n][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }
        double result = dfs(row, col, n, k);
        return result / b;
    }
}

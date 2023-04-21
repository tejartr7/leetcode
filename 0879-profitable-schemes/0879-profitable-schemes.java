class Solution {
    int mod = 1000000007;
    int[][][] dp = new int[101][101][101];

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profits) {
        // Initializing the base case.
        for (int count = 0; count <= n; count++) {
            dp[group.length][count][minProfit] = 1;
        }

        for (int index = group.length - 1; index >= 0; index--) {
            for (int count = 0; count <= n; count++) {
                for(int profit = 0; profit <= minProfit; profit++) {
                    // Ways to get a profitable scheme without this crime.
                    dp[index][count][profit] = dp[index + 1][count][profit];
                    if (count + group[index] <= n) {
                        // Adding ways to get profitable schemes, including this crime.
                        dp[index][count][profit]
                                = (dp[index][count][profit] + dp[index + 1][count + group[index]][Math.min(minProfit, profit + profits[index])]) % mod;
                    }
                }
            }
        }

        return dp[0][0][0];
    }
}
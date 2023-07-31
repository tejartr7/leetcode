
class Solution {
    int dp[][];
    
    public int helper(int i, int j, char ch1[], char ch2[]) {
        if (i >= ch1.length && j >= ch2.length)
            return 0;
        
        if (dp[i][j] != -1)
            return dp[i][j];
        
        int x = Integer.MAX_VALUE;
        
        if (i < ch1.length && j < ch2.length && ch1[i] == ch2[j])
            x = helper(i + 1, j + 1, ch1, ch2);
        else {
            int p = (i < ch1.length) ? ch1[i] + helper(i + 1, j, ch1, ch2) : Integer.MAX_VALUE;
            int q = (j < ch2.length) ? ch2[j] + helper(i, j + 1, ch1, ch2) : Integer.MAX_VALUE;
            int r = (i < ch1.length && j < ch2.length) ? ch1[i] + ch2[j] + helper(i + 1, j + 1, ch1, ch2) : Integer.MAX_VALUE;
            x = Math.min(p, Math.min(q, r));
        }
        
        return dp[i][j] = x;
    }
    
    public int minimumDeleteSum(String s1, String s2) {
        dp = new int[s1.length() + 1][s2.length() + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        return helper(0, 0, s1.toCharArray(), s2.toCharArray());
    }
}

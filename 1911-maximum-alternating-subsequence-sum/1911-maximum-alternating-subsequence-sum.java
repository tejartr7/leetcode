class Solution {
    long[][] dp;
    long maxi=0;
    public long helper(int i, int x, int[] nums) {
        int n = nums.length;
        if (i >= n) {
            return 0;
        }
        if (dp[i][x] != -1) {
            return dp[i][x];
        }
        if(x==1)
        {
            long a=helper(i+1,0,nums)+nums[i];
            long b=helper(i+1,1,nums);
            return dp[i][x]=Math.max(a,b);
        }
        long a=helper(i+1,1,nums)-nums[i];
        long b=helper(i+1,0,nums);
        return dp[i][x]=Math.max(a,b);
    }

    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        dp = new long[n][2];
        for(int i=0;i<nums.length;i++)
            Arrays.fill(dp[i],-1);
        maxi=Math.max(maxi,helper(0, 1, nums));
        maxi=Math.max(maxi,helper(0, 0, nums));
        return maxi;
    }
}

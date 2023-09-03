class Solution {
    int[][] dp;

    public int helper(int idx, int[] nums, int prev) {
        int n = nums.length;
        if (idx >= n) {
            return 0;
        }
        if (dp[idx][prev]!= -1)
            return dp[idx][prev];

        int currGroup = nums[idx];
        int minOp = Integer.MAX_VALUE;

        // New group should be >= prevGroup
        for (int newGroup = prev; newGroup <= 3; newGroup++) {
            int nextOp = helper(idx + 1, nums, newGroup);
            if (newGroup != currGroup)
                nextOp++; // 1 operation for changing the group of currIdx

            minOp = Math.min(minOp, nextOp);
        }

        return dp[idx][prev] = minOp;
    }

    public int minimumOperations(List<Integer> nums) {
        dp = new int[nums.size()][4];
        for(int[] r:dp)
        Arrays.fill(r, -1);
        int[] num = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++)
            num[i] = nums.get(i);
        return helper(0, num, 1);
    }
}

class Solution {
    int dp[][];
    
    public boolean helper(int sum, int idx, int curr, int nums[]) {
        if (curr == sum) {
            return true;
        }
        if (idx >= nums.length || curr > sum) {
            return false;
        }
        if (dp[idx][curr] != -1) {
            return dp[idx][curr] == 1;
        }
        
        boolean take = helper(sum, idx + 1, curr + nums[idx], nums);
        boolean notTake = helper(sum, idx + 1, curr, nums);
        boolean x = take || notTake;
        
        dp[idx][curr] = x ? 1 : 0;
        return x;
    }
    
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        if (sum % 2 == 1) {
            return false;
        }
        
        dp = new int[nums.length + 1][sum / 2 + 1];
        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        
        return helper(sum / 2, 0, 0, nums);
    }
}

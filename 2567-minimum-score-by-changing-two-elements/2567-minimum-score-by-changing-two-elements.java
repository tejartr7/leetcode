class Solution {
  public int minimizeSum(int[] nums) {
    final int n = nums.length;
    Arrays.sort(nums);
    // high score
    int high = Integer.MAX_VALUE;
    // left and right
    high = Math.min(high, nums[n - 2] - nums[1]);

    // right and right
    high = Math.min(high, nums[n - 3] - nums[0]);

    // left and left
    high = Math.min(high, nums[n - 1] - nums[2]);

    return high;
  }
}
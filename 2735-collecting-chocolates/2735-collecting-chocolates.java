class Solution {
    public long minCost(int[] nums, int x) {
        int n = nums.length;
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        long ans = sum;

        for (int cycle = 0; cycle < n; cycle++) {
            int[] temp = new int[n];
            for (int i = 1; i < n ; i++) {
                if (nums[i]> nums[i-1]) {
                    temp[i] = nums[i-1];
                } else {
                    temp[i] = nums[i];
                }
            }
            if (nums[0] > nums[n - 1]) {
                temp[0] = nums[n - 1];
            } 
            else temp[0]=nums[0];
            long tempSum = 0;
            for (int num : temp) {
                tempSum += num;
            }
            ans = Math.min(ans, tempSum + (1L * x * (cycle+1)));
            nums = temp;
        }

        return ans;
    }
}

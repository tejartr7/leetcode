class Solution {
    public int threeSumClosest(int[] nums, int target) {
    int result = 100000;
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1, hi = nums.length - 1;
            
            while ( lo < hi ) {
                int currentSum = nums[i] + nums[lo] + nums[hi];
                
                if (currentSum < target) lo++;
                else hi--;
                
                if(Math.abs(currentSum - target) < Math.abs(result - target)) {
                    result = currentSum;
                }
            }
        }
        
        return result;
    }
}
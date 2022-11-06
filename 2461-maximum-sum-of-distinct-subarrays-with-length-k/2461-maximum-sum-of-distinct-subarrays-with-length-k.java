import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int  n = nums.length;
        int j;
        long max = 0;
        long sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            sum = sum + nums[i];
            if (map.size() == k) {
                max = Math.max(max,sum);
            }
        }
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k];
            if (map.containsKey(nums[i-k]) &&map.get(nums[i-k])== 1)
                map.remove(nums[i-k]);
            if (map.containsKey(nums[i-k]) && map.get(nums[i-k])>1)
                map.put(nums[i-k], map.get(nums[i-k])-1);
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            sum = sum + nums[i];
            if (map.size() == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
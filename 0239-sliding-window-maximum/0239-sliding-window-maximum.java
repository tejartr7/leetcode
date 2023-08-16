
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> window = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!window.isEmpty() && window.peekFirst() < i - k + 1) {
                window.pollFirst();
            }

            while (!window.isEmpty() && nums[window.peekLast()] < nums[i]) {
                window.pollLast();
            }

            window.offerLast(i);

            if (i >= k - 1) {
                result[i - k + 1] = nums[window.peekFirst()];
            }
        }
        return result;
    }
}
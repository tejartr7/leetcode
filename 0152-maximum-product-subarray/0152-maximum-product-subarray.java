class Solution {
    public int maxProduct(int[] nums) {
 int maxProduct = nums[0];
        int maxEndingHere = nums[0];
        int minEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            int tempMax = Math.max(num, Math.max(maxEndingHere * num, minEndingHere * num));
            minEndingHere = Math.min(num, Math.min(maxEndingHere * num, minEndingHere * num));
            maxEndingHere = tempMax;
            maxProduct = Math.max(maxProduct, maxEndingHere);
        }

        return maxProduct;
    }
}
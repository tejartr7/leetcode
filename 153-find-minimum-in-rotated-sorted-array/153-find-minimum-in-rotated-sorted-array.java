class Solution {
    public int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int min1=100000000;
        int i;
        int l=nums.length;
        while(start<=end)
        {
            int min2=Math.min(nums[start],nums[end]);
            start++;
            end--;
            min1=Math.min(min1,min2);
        }
        return min1;
    }
}
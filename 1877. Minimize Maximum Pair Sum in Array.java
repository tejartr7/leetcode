class Solution {
    public int minPairSum(int[] nums) {
       int i=0;
        int j=nums.length-1;
    Arrays.sort(nums);
        int max=0;
        while(i<j)
        {
            max=Math.max(max,(nums[i]+nums[j]));
            i++;
            j--;
        }
        return max;
    }
}

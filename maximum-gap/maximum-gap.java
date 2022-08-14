class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int max=-1;
        int i;
        int l=nums.length;
        if(l<2)
            return 0;
        for(i=1;i<l;i++)
        {
            max=Math.max(max,Math.abs(nums[i]-nums[i-1]));
        }
        return max;
    }
}
class Solution {
    public int largestPerimeter(int[] nums) {
       Arrays.sort(nums);
        int l=nums.length;
        int i;
        if(l<3)
            return 0;
        for(i=l-3;i>=0;i--)
        {
            if(nums[i+1]+nums[i]>nums[i+2])
                return nums[i+1]+nums[i]+nums[i+2];
        }
        return 0;
    }
}
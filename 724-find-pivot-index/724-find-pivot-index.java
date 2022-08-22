class Solution {
    public int pivotIndex(int[] nums) {
        int left=0;
        int sum=0,right=0;
        int n=nums.length;
        int i;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        for(i=0;i<n;i++)
        {
            right=sum-nums[i]-left;
            if(right==left)
                return i;
            left+=nums[i];
        }
        return -1;
    }
}
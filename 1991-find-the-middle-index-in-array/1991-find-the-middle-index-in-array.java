class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        int left=0;
        int right=0;
        int i;
        int n=nums.length;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
        }
        for(i=0;i<n;i++)
        {   
            right=sum-left-nums[i];
            if(right==left)
                return i;
            left+=nums[i];
        }
        return -1;
    }
}
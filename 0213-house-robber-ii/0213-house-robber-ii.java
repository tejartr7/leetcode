class Solution {
    public int helper(int []nums)
    {
        int i,n=nums.length;
        int dp[]=new int[n];
        if(n<=0)
        return 0;
        if(n==1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0],nums[1]);
        int x=nums[0],y=Math.max(nums[0],nums[1]);
        for(i=2;i<n;i++)
        {
            int curr=Math.max(nums[i]+x,y);
            x=y;
            y=curr;
        }
        return y;
    }
    public int rob(int[] nums) {
        int i,n=nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int ans=0;
        int x=nums[0],y=Math.max(nums[0],nums[1]);
        for(i=2;i<n-1;i++)
        {
            int curr=Math.max(nums[i]+x,y);
            x=y;
            y=curr;
        }
        ans=Math.max(ans,y);
        x=nums[1];y=Math.max(nums[2],nums[1]);
        for(i=3;i<n;i++)
        {
            int curr=Math.max(nums[i]+x,y);
            x=y;
            y=curr;
        }
        ans=Math.max(ans,y);
        return ans;
    }
}
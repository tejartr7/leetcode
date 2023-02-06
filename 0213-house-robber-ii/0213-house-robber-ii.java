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
        int arr[]=new int[n-1];
        for(i=0;i<n-1;i++)
            arr[i]=nums[i];
        int ans=0;
        ans=Math.max(ans,helper(arr));
        for(i=0;i<n-1;i++)
        {
            arr[i]=nums[i+1];
        }
        ans=Math.max(ans,helper(arr));
        return ans;
    }
}
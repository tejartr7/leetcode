class Solution {
    public int helper(int nums[],int index,int dp[])
    {
        if(index>=nums.length-1)
            return 0;
        if(dp[index]!=-1)
            return dp[index];
        int x=nums[index];
       // int k=index;
        int ans=100000;
        for(int i=1;i<=x;i++)
        {
            int temp=1+helper(nums,index+i,dp);
            ans=Math.min(temp,ans);
        }
        dp[index]=ans;
        return dp[index];
    }
    public int jump(int[] nums) {
        int i,n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(nums,0,dp);
    }
}
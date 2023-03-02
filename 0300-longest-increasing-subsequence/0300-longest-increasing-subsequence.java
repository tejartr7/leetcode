class Solution {
    public int lengthOfLIS(int[] nums) {
        int count=1;
        int i,j,n=nums.length,max=1;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=1;
        for(i=1;i<n;i++)
        {   boolean found=false;
            for(j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i])
                {
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                }
            }
            if(dp[i]<0)
            {
                dp[i]=1;
            }
        }
        for(int x:dp)
        {
           max=Math.max(max,x);
        }
        return max;
    }
}
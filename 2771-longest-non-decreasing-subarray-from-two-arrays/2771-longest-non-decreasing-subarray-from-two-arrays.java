class Solution {
    public int helper(int []a)
    {
        int max=1;
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
		for(int i=1;i<n;i++)
		{
			if(a[i]>=a[i-1])
			{
				dp[i]=dp[i-1]+1;
			}
			max=Math.max(max,dp[i]);
		}
        return max;
    }
    public int maxNonDecreasingLength(int[] nums1, int[] nums2) {
        int i,n=nums1.length;
        int temp[][]=new int[n][2];
        int maxi=0;
        for(i=0;i<n;i++)
        {
            temp[i][0]=temp[i][1]=1;
            if(i!=0)
            {
                if (nums1[i] >= nums1[i - 1])
                    temp[i][0] = temp[i - 1][0] + 1;
                if(nums2[i] >= nums1[i - 1])
                    temp[i][1] = temp[i - 1][0] + 1;
                if(nums1[i] >= nums2[i - 1])
                    temp[i][0] = Math.max(temp[i][0], temp[i - 1][1] + 1);
                if(nums2[i] >= nums2[i - 1])
                    temp[i][1] = Math.max(temp[i][1], temp[i - 1][1] + 1);
            }
            maxi=Math.max(maxi,Math.max(temp[i][0],temp[i][1]));
        }
        return maxi;
    }
}
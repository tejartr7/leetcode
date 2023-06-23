class Solution {
    public int longestArithSeqLength(int[] nums) {
        int ans=2;
        int i,j,k;
        int n=nums.length;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                int d=nums[j]-nums[i];
                int prev=nums[j];
                int cnt=2;
                for(k=j+1;k<n;k++)
                {
                    if(nums[k]-prev!=d)
                    {
                        continue;
                    }
                    else
                    {
                        cnt++;
                        prev=nums[k];
                    }
                }
                ans=Math.max(ans,cnt);
            }
        }
        return ans;
    }
}
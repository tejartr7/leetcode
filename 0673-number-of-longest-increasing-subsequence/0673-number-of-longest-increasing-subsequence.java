
class Solution {
    public int findNumberOfLIS(int[] nums) {
        int i,j,n=nums.length;
        int len[]=new int[n];
        int cnt[]=new int[n];
        Arrays.fill(len,1);
        Arrays.fill(cnt,1);
        for(i=0;i<n;i++)
        {
            for(j=i-1;j>=0;j--)
            {
                if(nums[i]>nums[j])
                {
                    if(len[i]<len[j]+1)
                    {
                        len[i]=len[j]+1;
                        cnt[i]=cnt[j];
                    }
                    else if(len[i]==len[j]+1)
                    {
                        cnt[i]+=cnt[j];
                    }
                }
            }
        }
        int maxi=0;
        for(int x:len)
            maxi=Math.max(maxi,x);
        int ans=0;
        for(i=0;i<n;i++)
        {
            if(len[i]==maxi)
                ans+=cnt[i];
        }
        return ans;
    }
} 
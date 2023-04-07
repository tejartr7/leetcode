class Solution {
    public long subArrayRanges(int[] nums) {
        long ans=0;
        int i,j,n=nums.length;
        for(i=0;i<n;i++)
        {
            int mini=nums[i],maxi=nums[i];
            for(j=i;j<n;j++)
            {
                mini=Math.min(nums[j],mini);
                maxi=Math.max(nums[j],maxi);
                ans+=(long)maxi-(long)mini;
            }
        }
        return ans;
    }
}
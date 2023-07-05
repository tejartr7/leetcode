class Solution {
    public int longestSubarray(int[] nums) {
        int ans=0;
        int i=0,j=0,n=nums.length;
        int sum=0;
        int cnt=0;
        while(j<n)
        {
            if(nums[j]==0)
                cnt++;
            while(cnt>1)
            {
                if(nums[i]==0)
                    cnt--;
                i++;
            }
            ans=Math.max(ans,j-i);
            j++;
        }
        return ans;
    }
}
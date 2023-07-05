class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        int pre=0;
        int i=0,j=0;
        int n=nums.length;
        while(j<n)
        {
            if(nums[j]==0)
            pre++;
            while(pre>1)
            {
                if(nums[i]==0)
                pre--;
                i++;
            }
            max=Math.max(max,j-i);
            j++;
        }
        return max;
    }
}
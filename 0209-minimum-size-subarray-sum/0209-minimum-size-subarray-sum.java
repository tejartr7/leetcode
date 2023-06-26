class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int mini=Integer.MAX_VALUE;
        int n=nums.length;
        int sum=0;
        int i=0,j=0;
        while(j<n)
        {
            sum+=nums[j];
            while(sum>=target)
            {   
                mini=Math.min(mini,(j-i+1));
                sum-=nums[i++];
            }
            j++;
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}
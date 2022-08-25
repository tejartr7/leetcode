class Solution {
    public boolean canJump(int[] nums) {
        int sum=0;
        int i;
        int max=0;
        int n=nums.length;
        for(i=0;i<=sum;i++)
        {
            sum=Math.max(sum,i+nums[i]);
            if(sum>=n-1)
                return true;
        }
        return false;
    }
}
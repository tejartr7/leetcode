class Solution {
    public boolean canJump(int[] nums) {
        int l=nums.length;
        int i,j;
        int k=0;
        int sum=0;
        for(i=0;i<=sum;i++)
        {
           sum=Math.max(sum,i+nums[i]);
        
        if(sum>=l-1)
            return true;
       
        }
        
        return false;
    }
}
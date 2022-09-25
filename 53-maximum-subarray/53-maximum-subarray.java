class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
           sum+=nums[i];
           max=Math.max(max,sum);
           if(sum<0)
               sum=0;
        
        }
        return max;
    }
}
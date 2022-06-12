class Solution {
    public int maxSubArray(int[] nums) {
     int sum=0;
        int x=-1000000;
        int l=nums.length;
        int i;
        for(i=0;i<l;i++)
        {
            sum+=nums[i];
            x=Math.max(x,sum);
            if(sum<0)
                sum=0;
        }
        return x;
    }
}
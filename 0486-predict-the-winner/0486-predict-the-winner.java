class Solution {
    public int helper(int i,int j,int nums[])
    {
        if(i==j)
            return nums[i];
        int a=nums[i]-helper(i+1,j,nums);
        int b=nums[j]-helper(i,j-1,nums);
        return Math.max(a,b);
    }
    public boolean PredictTheWinner(int[] nums) {
        return helper(0,nums.length-1,nums)>=0;
    }
}
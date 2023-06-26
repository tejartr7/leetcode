class NumArray {
    int dp[];
    public NumArray(int[] nums) {
        int i,n=nums.length;
        dp=new int[n+1];
        dp[0]=0;
        for(i=1;i<=n;i++)
        {
            dp[i]=dp[i-1]+nums[i-1];
        }
    }
    
    public int sumRange(int left, int right) {
        return dp[right+1]-dp[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
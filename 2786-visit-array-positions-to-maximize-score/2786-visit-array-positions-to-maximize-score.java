class Solution {
    long dp[];
    public long helper(int idx, int nums[], int k) {
    if (idx >= nums.length) return 0l;
    if (dp[idx] != -1) return dp[idx];
    int x = 0;
    long maxi = nums[idx];
    for (x = idx + 1; x < nums.length; x++) {
        long take = 0;
        //long nottake=helper(x,nums,k);
        if (nums[x] % 2 == nums[idx] % 2) {
            take =nums[idx]+ helper(x, nums, k);
        } else {
            take =nums[idx]+ helper(x, nums, k) - k; 
        }
        maxi = Math.max(maxi,take);
    }
    return dp[idx] = maxi;
}
    public long maxScore(int[] nums, int x) {
        long a=nums[0];
        long b=nums[0];
        if(nums[0]%2==0)
            b-=x;
        else 
            a-=x;
        int i,n=nums.length;
        for(i=1;i<n;i++)
        {
            if(nums[i]%2==1)
                b=nums[i]+Math.max(b,a-x);
            else a=nums[i]+Math.max(a,b-x);
        }
        return Math.max(a,b);
    }
}
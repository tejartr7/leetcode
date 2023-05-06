class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int l=0;
        int i=0,j=nums.length-1;
        int n=j+1;
        int count=0;
        int mod=1000_000_007;
        int[] power = new int[n];
        power[0] = 1;
        for (i = 1; i < n; ++i) {
            power[i] = (power[i - 1] * 2) % mod;
        }
        i=0;
        while(i<=j)
        {
            if(nums[i]+nums[j]<=target)
            {
                count=(count+power[j-i])%mod;
                i++;
            }
            else
                j--;
        }
        return count%mod;
    }
}
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans=0;
        int i,n=nums.length;
        long count=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]==0)
                count++;
            else{
                ans+=(count*(count+1))/2;
                count=0;
            }
        }
        ans+=(count*(count+1))/2;
        return ans;
    }
}
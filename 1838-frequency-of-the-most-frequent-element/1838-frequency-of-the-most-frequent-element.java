class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0,j=0,n=nums.length;
        int sum=0;
        int res=0;
        while(j<n)
        {
            sum+=nums[j];
            while(i<n && k<nums[j]*(j-i+1)-sum)
            {
                sum-=nums[i];
                i++;
            }
            res=Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}
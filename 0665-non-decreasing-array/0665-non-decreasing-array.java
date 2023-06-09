class Solution {
    public boolean checkPossibility(int[] nums) {
        int i,n=nums.length;
        int cnt=0;
        for(i=1;i<n;i++)
        {
            if(nums[i-1]>nums[i])
            {
                cnt++;
                if(i<2 || nums[i]>=nums[i-2])
                {
                    nums[i-1]=nums[i];
                }
                else 
                    nums[i]=nums[i-1];
            }
        }
        return cnt<=1;
    }
}
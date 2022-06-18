class Solution {
    public int pivotIndex(int[] nums) {
        int l=nums.length;
     int sum=0;
        int left=0;
         int i;
        for(i=0;i<l;i++)
            sum+=nums[i];
        for(i=0;i<l;i++)
        {
            if(left==sum-left-nums[i])
                return i;
            left+=nums[i];
        }
        return -1;
    }
}
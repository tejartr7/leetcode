class Solution {
    public int findPeakElement(int[] nums) {
        int k=nums.length;
        int i;
        int pos=0;
        int max=nums[0];
        for(i=1;i<k;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
                pos=i;
            }
        }
        return pos;
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
       int count=0;
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]!=val)
            {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
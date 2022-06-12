class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
        int i;
        int k=nums.length;
        for(i=0;i<k;i++)
        {
            if(i+1<k)
            {
                if(nums[i]==nums[i+1])
                    return true;
            }
        }
        return false;
    }
}
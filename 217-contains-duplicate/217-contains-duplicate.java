class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i,n=nums.length;
        for(i=0;i<n-1;i++)
        {
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}
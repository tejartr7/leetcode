class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
        int i;
        int k=nums.length;
        Set<Integer> a=new HashSet<>();
        for(i=0;i<k;i++)
        {
            if(a.contains(nums[i]))
                return true;
            a.add(nums[i]);
        }
        return false;
    }
}
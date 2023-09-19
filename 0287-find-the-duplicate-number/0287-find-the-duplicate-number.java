class Solution {
    public int findDuplicate(int[] nums) {
        int l=nums.length;
      Set<Integer> a=new HashSet<>();
        int i;
        for(i=0;i<l;i++)
        {
            if(a.contains(nums[i]))
                return nums[i];
            else
                a.add(nums[i]);
        }
        return 0;
    }
}
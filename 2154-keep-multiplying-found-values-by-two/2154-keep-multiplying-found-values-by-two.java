class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> a=new HashSet<>();
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
            a.add(nums[i]);
        while(a.contains(original))
        {
            original*=2;
            
        }
        return original;
    }
}
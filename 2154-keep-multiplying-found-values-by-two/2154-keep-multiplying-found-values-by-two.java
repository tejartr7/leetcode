class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        Set<Integer> a=new HashSet<>();
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
        {   if(!a.contains(nums[i]))
            a.add(nums[i]);
        }
        while(a.contains(original))
        {
            original*=2;
            
        }
        return original;
    }
}
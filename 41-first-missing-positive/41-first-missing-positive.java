class Solution {
    public int firstMissingPositive(int[] nums) {
     Arrays.sort(nums);
      int i;
       Set<Integer> a=new HashSet<Integer>();
        for(i=0;i<nums.length;i++)
        {
            a.add(nums[i]);
        }
        int j=1;
        while(a.contains(j))
        {
            j++;
        }
        return j;
    }
}
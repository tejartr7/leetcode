class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int i,n=nums.length;
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
            set.add(nums[i]);
        for(i=0;i<n;i++)
        {
            if(nums[i]>0)
            {
                if(set.contains(-nums[i]))
                {
                    max=Math.max(nums[i],max);
                }
            }
        }
        if(max==Integer.MIN_VALUE)
            return -1;
        return max;
    }
}
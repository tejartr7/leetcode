class Solution {
    public int findClosestNumber(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        Set<Integer> a=new HashSet<>();
        int n=nums.length,i;
        for(i=0;i<n;i++)
        {
            int x=Math.abs(nums[i]-0);
            if(x<min)
            {
                min=x;
                ans=nums[i];
            }
            a.add(nums[i]);
        }
        if(a.contains(-1*ans) && ans<0)
        {
            return -ans;
        }
        return ans;
    }
}
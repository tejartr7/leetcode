class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]=new int[2];
        int i,n=nums.length;
        Map<Integer,Integer> index=new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(index.containsKey(target-nums[i]))
            {
                ans[0]=index.get(target-nums[i]);
                ans[1]=i;
                return ans;
            }
            else
                index.put(nums[i],i);
        }
        return ans;
    }
}
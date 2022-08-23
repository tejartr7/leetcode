class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> num=new HashMap<>();
        int i;
        int n=nums.length;
        int ans[]=new int[2];
        for(i=0;i<n;i++)
        {
            if(num.containsKey(target-nums[i]))
            {
                ans[0]=i;
                ans[1]=num.get(target-nums[i]);
            }
            else
            {
                num.put(nums[i],i);
            }
        }
        return ans;
    }
}
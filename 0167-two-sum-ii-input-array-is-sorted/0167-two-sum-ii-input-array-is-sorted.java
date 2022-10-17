class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> a=new HashMap<>();
        int sum=0;
        int i,n=nums.length;
        int ans[]=new int[2];
        Arrays.fill(ans,-1);
        for(i=0;i<n;i++)
        {
            if(a.containsKey(target-nums[i]))
            {
                ans[0]=a.get(target-nums[i]);
                ans[1]=i+1;
                return ans;
            }
            a.put(nums[i],i+1);
        }
        return ans;
    }
}
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        map.put(0,1);
        int ans=0;
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                ans+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
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
    public long countInterestingSubarrays(List<Integer> nums, int mod, int k) {

        int cnt=0;
        int i,j;
        int n=nums.size();
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        long ans=0;
        for(i=0;i<n;i++)
        {
            if(nums.get(i)%mod==k)
            {
                cnt++;
                cnt%=mod;
            }
            ans+=map.getOrDefault((cnt-k+mod)%mod,0);
            map.put(cnt,map.getOrDefault(cnt,0)+1);
        }
        return ans;
}
}
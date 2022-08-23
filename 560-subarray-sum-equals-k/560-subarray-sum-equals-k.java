class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> a=new HashMap<>();
        
        int n=nums.length;
        int cur=0;
        int ans=0;
       a.put(0,1);
        for(int i:nums)
        {
            cur+=i;
            if(a.containsKey(cur-k))
            {
                ans+=a.get(cur-k);
            }
            a.put(cur,a.getOrDefault(cur,0)+1);
            
        }
        return ans;
    }
}
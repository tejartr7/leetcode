class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans=0,sum=0;
        int i,j,n=nums.length;
        int pre[]=new int[n];
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        pre[0]=nums[0];
        for(i=1;i<n;i++)
            pre[i]=nums[i]+pre[i-1];
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-goal))
            {
                ans+=map.get(sum-goal);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}
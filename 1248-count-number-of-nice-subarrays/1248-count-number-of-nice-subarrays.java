class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans=0;
        int count=0;
        int i,j,n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(i=0;i<n;i++)
        {
            nums[i]=nums[i]%2;
        }
        int sum=0;
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            ans+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        //System.out.println(map);
        return ans;
    }
}
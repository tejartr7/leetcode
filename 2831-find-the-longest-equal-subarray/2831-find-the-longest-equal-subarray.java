class Solution {
    public int longestEqualSubarray(List<Integer> nums, int k) {
        int maxi=0;
        Map<Integer,Integer> map=new HashMap<>();
        int i=0,j=0;
        int cnt=0;
        int val=0;
        for(i=0;i<nums.size();i++)
        {
            int x=nums.get(i);
            map.put(x,map.getOrDefault(x,0)+1);
            cnt=Math.max(cnt,map.get(x));
            if(i-j+1-cnt>k)
            {
                map.put(nums.get(j),map.getOrDefault(nums.get(j),0)-1);
                j++;
            }
        }
        return cnt;
    }
}
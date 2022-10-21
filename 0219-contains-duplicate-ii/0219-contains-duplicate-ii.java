class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i,j,n=nums.length;
        i=0;j=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(map.containsKey(nums[i]) && i-map.get(nums[i])<=k)
                return true;
            map.put(nums[i],i);
        }
        return false;
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
        //time optimized solution
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> lonelyList=new ArrayList<>();
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int x:nums)
        {
            int k=map.get(x);
            if(k>1 || map.containsKey(x-1) || map.containsKey(x+1))
                continue;
            else
                lonelyList.add(x);
        }
        return lonelyList;
    }
}
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> result=new HashMap<>();
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            result.put(nums[i],result.getOrDefault(nums[i],0)+1);
        }
        for(int key:result.keySet())
        {
            if(result.get(key)==1)
            return key;
        }
        return -1;

    }
}
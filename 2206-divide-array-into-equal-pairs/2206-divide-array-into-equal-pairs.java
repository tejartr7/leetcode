class Solution {
    public boolean divideArray(int[] nums) {
        int i,n=nums.length;
        Map<Integer,Integer> a=new HashMap<>();
        for(i=0;i<n;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        for(int k:a.keySet())
        {
            if(a.get(k)%2!=0)
                return false;
        }
        return true;
        
    }
}
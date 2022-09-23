class Solution {
    public int[] numberOfPairs(int[] nums) {
        Map<Integer,Integer> a=new HashMap<>();
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            a.put(nums[i],a.getOrDefault(nums[i],0)+1);
        }
        int ans[]=new int[2];
        int count=0;
        for(int k:a.keySet())
        {
            count+=(a.get(k)/2);
            
        }
        ans[0]=count;
        ans[1]=n-(2*count);
        return ans;
    }
}
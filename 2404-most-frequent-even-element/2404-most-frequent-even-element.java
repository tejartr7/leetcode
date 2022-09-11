class Solution {
    public int mostFrequentEven(int[] nums) {
        int i,n=nums.length;
        Map<Integer,Integer> ans=new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
            }
        }
        int max=Integer.MIN_VALUE;
        int a=Integer.MAX_VALUE;
        
        for(int k:ans.keySet())
        {
          if(ans.containsKey(a) && ans.get(k)==ans.get(a))
          {
              a=Math.min(a,k);
              max=Math.max(ans.get(k),ans.get(a));
          }
         else if(ans.get(k)>max)
         {
             a=k;
             max=Math.max(max,ans.get(k));
         }
                 
           
        }
        if(ans.size()<=0)
            return -1;
        return a;
        
    }
}
class Solution {
   // public int subarraySum(int[] nums, int k) {
        public int subarraySum(int[] n, int k) {
       int count=0;
       int currsum=0;
        HashMap<Integer,Integer> a=new HashMap<>();
       a.put(0,1);
        for(int i:n)
        {
            currsum+=i;
            if(a.containsKey(currsum-k))
            count+=a.get(currsum-k);
            a.put(currsum,a.getOrDefault(currsum,0)+1);    
            
        }
        return count; 
    }
}
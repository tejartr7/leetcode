class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> nums=new HashMap<>();
        int i;
        int l=arr.length;
        for(i=0;i<l;i++)
        {
            nums.put(arr[i],nums.getOrDefault(arr[i],0)+1);
        }
        int b[]=new int[nums.size()];
        int j=0;
        for(int k:nums.keySet())
        {
            b[j]=nums.get(k);
            j++;
            
        }
        Set<Integer> a=new HashSet<>();
        int x=nums.size();
        for(i=0;i<x;i++)
        {
            if(a.contains(b[i]))
                return false;
            a.add(b[i]);
        }
        return true;
        
    }
}
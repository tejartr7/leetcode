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
        Set<Integer> a=new HashSet<>();
        for(int x:nums.values())
        {
            if(a.contains(x))
                return false;
            a.add(x);
        }
        return true;
    }
}
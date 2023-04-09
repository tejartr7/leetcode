class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,List<Integer>> map=new TreeMap<>();
        int i,n=arr.length;
        for(i=0;i<n;i++)
        {
            int x=Integer.bitCount(arr[i]);
            if(!map.containsKey(x))
            map.put(x,new ArrayList<>());
            map.get(x).add(arr[i]);
        }
        i=0;
        for(int x:map.keySet())
        {
            List<Integer> list=new ArrayList<>(map.get(x));
            Collections.sort(list);
            for(int y:list)
                arr[i++]=y;
        }
        return arr;
    }
}
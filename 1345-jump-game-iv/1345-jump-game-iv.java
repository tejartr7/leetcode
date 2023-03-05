class Solution {
    public int minJumps(int[] arr) {
        int i,n=arr.length;
        int step=0;
        if(n<=1) return 0;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],new ArrayList<>());
            map.get(arr[i]).add(i);
        }
        //System.out.println(map);
        //Queue<Integer> q=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        visited.add(0);
        list.add(0);
        while(!list.isEmpty())
        {
            List<Integer> nextLevel=new ArrayList<>();
            for(int x:list)
            {
                if(x==n-1) return step;
                if(x-1>=0 && !visited.contains(x-1))
                {
                    nextLevel.add(x-1);
                    visited.add(x-1);
                }
                if(x+1<n && !visited.contains(x+1))
                {
                    nextLevel.add(x+1);
                    visited.add(x+1);
                }
                if(map.containsKey(arr[x])){
                for(int k:map.get(arr[x]))
                {
                    if(!visited.contains(k))
                    {
                        nextLevel.add(k);
                        visited.add(k);
                    }
                }
                map.remove(arr[x]);
                }
            }
            list=nextLevel;
            step++;
        }
        return -1;
    }
}
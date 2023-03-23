class Solution {
    public void dfs(int i,Set<Integer> visited,Map<Integer,List<Integer>> map)
    {
        if(visited.contains(i))
            return ;
        visited.add(i);
        if(!map.containsKey(i))
            return ;
        for(int x:map.get(i))
        {
            if(!visited.contains(x))
                dfs(x,visited,map);
        }
    }
    public int makeConnected(int n, int[][] c) {
        int i,l=c.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        if(n>l+1) return -1;
        for(i=0;i<l;i++)
        {
            int x=c[i][0],y=c[i][1];
            if(!map.containsKey(x))
                map.put(x,new ArrayList<>());
            if(!map.containsKey(y))
                map.put(y,new ArrayList<>());
            map.get(x).add(y);
            map.get(y).add(x);
        }
        int count=0;
        Set<Integer> visited=new HashSet<>();
        for(i=0;i<n;i++)
        {
            if(!visited.contains(i))
            {
                count++;
                dfs(i,visited,map);
            }
        }
        return count-1;
    }
    
}
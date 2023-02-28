class Solution {
    
    public long dfs(int i,boolean visited[],
        List<List<Integer>> list)
    {
        long count=1l;
        visited[i]=true;
        for(int x:list.get(i))
        {
            if(!visited[x])
                count+=dfs(x,visited,list);
        }
        return count;
    }
    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        int i;
        long ans=0,temp=(long)n;
        for(i=0;i<n;i++)
        {
            list.add(i,new ArrayList<>());
        }
        for(i=0;i<edges.length;i++)
        {
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        //System.out.println(list);
        boolean visited[]=new boolean[n];
        for(i=0;i<n;i++)
        {
            if(!visited[i])
            {
                long x=dfs(i,visited,list);
                ans+=x*(temp-x);
                temp-=x;
            }
            //visited[i]=true;
        }
        return ans;
    }
}
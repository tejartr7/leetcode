class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int i,j,n=graph.length;
        int order[]=new int[n];
        for(i=0;i<n;i++)
        order[i]+=graph[i].length;
        List<Integer> list=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(i=0;i<n;i++)
        {
            map.put(i,new HashSet<Integer>());
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<graph[i].length;j++)
            {
                map.get(graph[i][j]).add(i);
            }
        }
        for(i=0;i<n;i++)
        {
            if(order[i]==0)
            q.offer(i);
        }
        while(!q.isEmpty())
        {
            int top=q.poll();
            for(int x:map.get(top))
            {
                order[x]--;
                if(order[x]==0)
                q.offer(x);
            }
        }
        for(i=0;i<n;i++)
        {
            if(order[i]==0)
            list.add(i);
        }
        return list;
    }
}
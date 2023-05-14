class Solution {
    int node=0;
    int e=0;
    Map<Integer,List<Integer>> map=new HashMap<>();
    
    public void dfs(int i,boolean visited[])
    {
        visited[i]=true;
        node++;
        for(int x:map.get(i))
        {
            e++;
            if(!visited[x])
                dfs(x,visited);
        }
    }
    public int countCompleteComponents(int n, int[][] edges) {
        boolean visited[]=new boolean[n];
        Arrays.fill(visited,false);
        int i,j;
        int ans=0;
        for(i=0;i<n;i++)
            map.put(i,new ArrayList<>());
        for(i=0;i<edges.length;i++)
        {
            int x=edges[i][0];
            int y=edges[i][1];
            map.get(x).add(y);
            map.get(y).add(x);
        }
        for(i=0;i<n;i++)
        {
            if(!visited[i])
            {
                node=0;
                e=0;
                dfs(i,visited);
                
                e/=2;
                int x=(node*(node-1))/2;
                if(x==e)
                    ans++;
            }
        }
        return ans;
    }
}
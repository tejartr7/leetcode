class Solution {
    public boolean dfs(int node,int target,boolean visited[],Map<Integer,List<Integer>> map)
    {
        if(node==target) return true;
        if(visited[node]) return false;
        visited[node]=true;
        for(int x:map.get(node))
        {
            if(x==target) return true;
            if(!visited[x])
            {
                if(dfs(x,target,visited,map))
                    return true;
            }
        }
        return false;
    }
    public List<Boolean> checkIfPrerequisite(int n,int[][] edges, int[][] queries) {
        List<Boolean> ans=new ArrayList<>();
        Map<Integer,List<Integer>> map=new HashMap<>();
        int i,j;
        for(i=0;i<n;i++)
            map.put(i,new ArrayList<>());
        int l=edges.length;
        for(i=0;i<l;i++)
        {
            int x=edges[i][0];
            int y=edges[i][1];
            map.get(y).add(x);
        }
        int q=queries.length;
        for(i=0;i<q;i++)
        {
            int x=queries[i][0];
            int y=queries[i][1];
            boolean visited[]=new boolean[n];
            boolean valid=dfs(y,x,visited,map);
            ans.add(valid);
        }
        return ans;
    }
}
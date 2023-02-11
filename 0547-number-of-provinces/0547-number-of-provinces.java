class Solution {
    public void dfs(int node,Map<Integer,ArrayList<Integer>> map,
    boolean visited[])
    {
        visited[node]=true;
        for(int x:map.get(node))
        {
            if(!visited[x])
            {
                dfs(x,map,visited);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int i,j,n=isConnected.length;
        int count=0;
        Map<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(i=0;i<=n;i++)
            map.put(i,new ArrayList<Integer>());
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(isConnected[i][j]==1 && i!=j)
                {
                    if(!map.get(i).contains(j))
                    map.get(i).add(j);
                    if(!map.get(j).contains(i))
                    map.get(j).add(i);
                }
            }
        }
        boolean visited[]=new boolean[n];
        for(i=0;i<n;i++)
        {
            if(!visited[i])
            {
                count++;
               // visited[i]=true;
                dfs(i,map,visited);
            }
        }
        return count;
    }
}
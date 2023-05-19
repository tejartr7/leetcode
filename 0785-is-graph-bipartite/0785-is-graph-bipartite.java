class Solution {
    Map<Integer,List<Integer>> map;
    public boolean check(int i,int color,int col[])   
    {
        col[i]=color;
        for(int x:map.get(i))
        {
            if(col[x]==-1)
            {
                if(!check(x,1-color,col))
                    return false;
            }
            else if(col[x]==col[i])
            {
                return false;
            }
        }
        return true;
    }
    public boolean isBipartite(int[][] graph) {
        map=new HashMap<>();
        int i,j,n=graph.length;
        for(i=0;i<n;i++)
            map.put(i,new ArrayList<>());
        for(i=0;i<graph.length;i++)
        {
            for(j=0;j<graph[i].length;j++)
            {
                if(!map.get(i).contains(graph[i][j]))
                map.get(i).add(graph[i][j]);
            }
        }
        int col[]=new int[n];
        Arrays.fill(col,-1);
        for(i=0;i<n;i++)
        {
            if(col[i]==-1)
            {
                if(!check(i,0,col))
                    return false;
            }
        }
        return true;
    }
}
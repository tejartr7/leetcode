class Solution {
    public int maximalNetworkRank(int n, int[][] roads) {
        int i,j;
        int l=roads.length;
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(i=0;i<=n;i++)
            map.put(i,new HashSet<>());
        int indegree[]=new int[n+1];
        for(i=0;i<l;i++)
        {
            int x=roads[i][0];
            int y=roads[i][1];
            map.get(x).add(y);
            map.get(y).add(x);
            indegree[x]++;
            indegree[y]++;
        }
        int maxi=0;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    int cnt=indegree[i]+indegree[j];
                    if(map.get(i).contains(j))
                        cnt--;
                    maxi=Math.max(maxi,cnt);
                }
            }
        }
        return maxi;
    }
}
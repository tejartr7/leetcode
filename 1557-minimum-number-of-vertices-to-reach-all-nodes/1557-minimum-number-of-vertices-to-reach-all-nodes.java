class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        Set<Integer> visited=new HashSet<>();
        List<Integer> list=new ArrayList<>();
        int i;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(i=0;i<n;i++)
            map.put(i,new ArrayList<>());
        int indegree[]=new int[n];
        for(i=0;i<edges.size();i++)
        {
            map.get(edges.get(i).get(0)).add(edges.get(i).get(1));
            indegree[edges.get(i).get(1)]++;
        }
        //System.out.println(map);
        for(i=0;i<n;i++)
            if(indegree[i]==0)
                list.add(i);
        return list;
    }
}
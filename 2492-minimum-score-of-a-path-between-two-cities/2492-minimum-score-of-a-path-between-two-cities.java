
class Solution {
    public int minScore(int n, int[][] roads) {
         Queue<Integer> q=new LinkedList<>();
        Map<Integer,Map<Integer,Integer>> map=new HashMap<>();
        int i,l=roads.length;
        for(i=0;i<l;i++)
        {
           // List<Integer> x=adj.get(i);
            int a=roads[i][0],b=roads[i][1],c=roads[i][2];
            if(!map.containsKey(a))
                map.put(a,new HashMap<>());
            if(!map.containsKey(b))
                map.put(b,new HashMap<>());
            map.get(a).put(b,c);
            map.get(b).put(a,c);
        }
        //System.out.println(map);
        //return 5;
        Set<Integer> visited=new HashSet<>();
        int mini=Integer.MAX_VALUE;
        q.offer(1);
        while(!q.isEmpty())
        {
            int x=q.poll();
            for (Map.Entry<Integer, Integer> entry : map.get(x).entrySet()) {
                int adj = entry.getKey(), score = entry.getValue();
                if (!visited.contains(adj)) {
                    q.offer(adj);
                    visited.add(adj);
                }
                mini = Math.min(mini,score);
            }
        }
        return mini;
    }
}
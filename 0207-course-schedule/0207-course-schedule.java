class Solution {
       public boolean canFinish(int n, int[][] pre) {
           List<List<Integer>> list=new ArrayList<>();
           int i;
           List<Integer> topo=new ArrayList<>();
           int indegree[]=new int[n];
           Queue<Integer> q=new LinkedList<>();
           for(i=0;i<n;i++)
           {
               list.add(i,new ArrayList<>());
           }
           for(i=0;i<pre.length;i++)
           {
               list.get(pre[i][1]).add(pre[i][0]); 
               indegree[pre[i][0]]++;
           }
           //System.out.println(list);
           for(i=0;i<n;i++)
           {
               if(indegree[i]==0)
                   q.offer(i);
           }
           while(!q.isEmpty())
           {
               int x=q.poll();
               topo.add(x);
               for(int temp:list.get(x))
               {
                   indegree[temp]--;
                   if(indegree[temp]==0)
                       q.offer(temp);
               }
           }
           return topo.size()==n;
    }
}
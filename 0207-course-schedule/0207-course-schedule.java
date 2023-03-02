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
               {q.add(i);
                topo.add(i);
               }
           }
           while(!q.isEmpty())
           {
               int top=q.poll();
               for(int x:list.get(top))
               {
                   indegree[x]--;
                   if(indegree[x]==0)
                   {
                       q.offer(x);
                       topo.add(i);
                   }
               }
           }
           return topo.size()==n;
    }
}
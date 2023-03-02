class Solution {
    public int[] findOrder(int n, int[][] pre) {
           List<List<Integer>> list=new ArrayList<>();
           int i;
           List<Integer> topo=new ArrayList<>();
           int indegree[]=new int[n];
           Queue<Integer> q=new LinkedList<>();
           if(n==1 && pre.length==0)
               return new int[]{0};
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
           int ans[]=new int[n];
           int k=0;
           for(i=0;i<n;i++)
           {
               if(indegree[i]==0)
               {q.add(i);
                ans[k++]=i;
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
                       ans[k++]=x;
                   }
               }
           } 
        return k==n?ans:new int[0];
    }
}
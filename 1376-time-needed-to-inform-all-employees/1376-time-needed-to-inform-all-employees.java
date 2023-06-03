class pair
{
    int x;
    int y;
    pair(int a,int b)
    {
        x=a;
        y=b;
    }
}

class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        Map<Integer,List<Integer>> map=new HashMap<>();
        int i,j;
        for(i=0;i<n;i++)
        {
            map.put(i,new ArrayList<>());
        }
        for(i=0;i<n;i++)
        {
            if(manager[i]!=-1)
            {
                map.get(manager[i]).add(i);
            }
        }
        Queue<pair> q=new LinkedList<>();
        q.offer(new pair(headID,0));
        int ans=0;
        boolean visited[]=new boolean[n];
        visited[headID]=true;
        while(q.size()>0)
        {
            pair top=q.poll();
           // System.out.println(q);
            ans=Math.max(ans,top.y);
            for(int x:map.get(top.x))
            {
                if(!visited[x])
                {
                    q.offer(new pair(x,top.y+informTime[top.x]));
                    visited[x]=true;
                }
            }
        }
        return ans;
    }
}
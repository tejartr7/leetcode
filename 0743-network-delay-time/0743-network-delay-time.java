class pair
{
    int a,b;
    pair(int x,int y)
    {
        a=x;
        b=y;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        boolean visited[]=new boolean[n];
        int cnt=n;
        Map<Integer,List<pair>> map=new HashMap<>();
        int i,j;
        for(i=0;i<n;i++)
            map.put(i,new ArrayList<>());
        int l=times.length;
        for(i=0;i<l;i++)
        {
            int x=times[i][0]-1;
            int y=times[i][1]-1;
            int z=times[i][2];
            map.get(x).add(new pair(y,z));
        }
        Queue<pair> q=new PriorityQueue<>((a,b)->a.b-b.b);
        q.offer(new pair(k-1,0));
        while(!q.isEmpty())
        {
            pair top=q.poll();
            if(visited[top.a])
                continue;
            cnt--;
            if(cnt==0) return top.b;
            visited[top.a]=true;
            for(pair x:map.get(top.a))
            {
                if(!visited[x.a])
                    q.offer(new pair(x.a,top.b+x.b));
                
            }
        }
        return -1;
    }
}
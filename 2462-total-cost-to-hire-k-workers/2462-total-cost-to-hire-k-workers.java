class pair
{
    int val;
    int idx;
    pair(int a,int b)
    {
        val=a;
        idx=b;
    }
}
class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        long ans=0;
        int i,j,n=costs.length;
        PriorityQueue<Integer> a=new PriorityQueue<>();
        PriorityQueue<Integer> b=new PriorityQueue<>();
        i=0;
        j=Math.max(candidates,n-candidates);
        while (i < candidates)
        a.add(costs[i++]);
        while(j<n)
            b.add(costs[j++]);
        boolean vis[]=new boolean[n];
        j=n-1-candidates;
        Arrays.fill(vis,false);
        while(k>0)
        {
            if(b.isEmpty() || !a.isEmpty() && a.peek()<=b.peek()){
                ans+=a.poll();
                if(i<=j)
                {
                    a.add(costs[i++]);
                }
            }
            else
            {
                ans+=b.poll();
                if(i<=j)
                    b.add(costs[j--]);
            }
            k--;
        }
        return ans;
    }
}
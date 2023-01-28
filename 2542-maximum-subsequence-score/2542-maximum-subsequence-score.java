class Solution {
        public long maxScore(int[] s, int[] e, int k) {
        int n=s.length;
        int dp[][]=new int[n][2];
        int i;
        for(i=0;i<n;i++)
        {
            dp[i]=new int[]{e[i],s[i]};
        }
        Arrays.sort(dp,(a,b)->b[0]-a[0]);
        long ans=0,sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(i=0;i<n;i++)
        {
            int x=dp[i][0];
            int y=dp[i][1];
            pq.add(y);
            sum+=y;
            if(pq.size()>k)
            sum-=pq.poll();
            if(pq.size()==k)
            ans=Math.max(ans,sum*x);
        }
        return ans;
    }
}
class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int i,j,n=nums1.length;
        int dp[][]=new int[n][2];
        for(i=0;i<n;i++)
        {
            dp[i]=new int[]{nums1[i],nums2[i]};
        }
        long sum=0,maxi=0;
        Arrays.sort(dp,(a,b)->b[1]-a[1]);
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(i=0;i<n;i++)
        {
            int x=dp[i][0];
            int y=dp[i][1];
            sum+=x;
            pq.offer(x);
            if(pq.size()>k)
                sum-=pq.poll();
            if(pq.size()==k)
                maxi=Math.max(maxi,sum*y);
        }
        return maxi;
    }
}
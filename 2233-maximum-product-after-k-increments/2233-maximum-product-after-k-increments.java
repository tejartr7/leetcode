class Solution {
    public int maximumProduct(int[] nums, int k) {
        int mod=1000_000_007;
        int i,n=nums.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long maxi=0;
        long ans=1;
        long l=(long)n;
        for(int x:nums)
            pq.offer(x);
        while(k>0)
        {
            int x=pq.poll();
            pq.offer(x+1);
            k--;
        }
        //System.out.println(pq);
        while(!pq.isEmpty())
        {
            ans=(ans*pq.poll()%mod);
        }
        System.out.println(ans);
        return (int)(ans%mod);
    }
}
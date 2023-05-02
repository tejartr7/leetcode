class Solution {
    public long minimumRemoval(int[] beans) {
        long ans=Long.MAX_VALUE;
        Arrays.sort(beans);
        long sum=0;
        for(int x:beans)
            sum+=x;
        ans=Math.min(ans,sum);
        long prev=0;
        int i,n=beans.length;
        for(i=0;i<n;i++)
        {
            long temp=prev+sum-(long)(n-i)*(long)beans[i];
            ans=Math.min(ans,temp);
            sum-=beans[i];
            prev+=beans[i];
        }
        return ans;
    }
}
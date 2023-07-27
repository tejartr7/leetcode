class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long l=1,h=0;
        for(int x:batteries)
            h+=x;
        h/=n;
        long ans=-1;
        while(l<=h)
        {
            long cnt=0;
            long mid=l+(h-l)/2;
            long sum=0;
            for(int x:batteries)
            {
                long temp=x;
                cnt+=Math.min(temp,mid);
            }
            if(cnt>=n*mid)
            {
                ans=mid;
                l=mid+1;
            }
            else h=mid-1;
        }
        return ans;
    }
}
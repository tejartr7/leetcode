class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int l=1,h=1000_000_000;
        int i=0,n=dist.length;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            double count=0;
            for(i=0;i<n;i++)
            {
                if(i!=n-1)
                {
                    count+=(double)(dist[i]/mid);
                    if(dist[i]%mid>0)
                        count++;
                }
                else
                {
                    count+=(double)((double)dist[i]/(double)mid);
                }
            }
            if(count<=hour)
            {
                h=mid;
            }
            else l=mid+1;
        }
        return l==1000_000_000?-1:l;
    }
}
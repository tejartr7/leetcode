class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        int max_time = 0;
        for (int t : time) {
            max_time = Math.max(max_time, t);
        }
        long l=1,h=(long) max_time * totalTrips;
        while(l<h)
        {
            long mid=l+(h-l)/2;
            long count=0;
            for(int x:time)
            {
                count+=mid/x;
            }
            if(count>=totalTrips)
            {
                h=mid;
            }
            else
                l=mid+1;
        }
        return l;
    }
}
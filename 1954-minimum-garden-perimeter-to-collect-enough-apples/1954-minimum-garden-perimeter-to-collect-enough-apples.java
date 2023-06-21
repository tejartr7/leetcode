class Solution {
    public long minimumPerimeter(long n) {
        long l=0;
        long r=100000;
        while(l<r)
        {
            long m=(l+r)/2;
            if(2*m*(m+1)*(2*m+1)>=n)
                r=m;
            else l=m+1;
        }
        return l*8;
    }
}
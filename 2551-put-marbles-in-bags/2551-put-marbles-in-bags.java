class Solution {
    public long putMarbles(int[] a, int k) {
        int n=a.length,i;
        long b[]=new long[n-1];
        for(i=0;i<n-1;i++)
        {
            b[i]=a[i+1]+a[i];
        }
        Arrays.sort(b);
        long res=0; 
        for(i=0;i<k-1;i++)
        {
            res+=b[n-i-2]-b[i];
        }
        return res;
    }
}
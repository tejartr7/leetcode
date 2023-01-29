class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        int i,n=a.length;
        long m=mass;
        for(i=0;i<n;i++)
        {
            if(m>=a[i])
                m+=a[i];
            else
                return false;
        }
        return true;
    }
}
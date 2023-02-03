class Solution {
    public boolean carPooling(int[][] trips, int cap) {
        Arrays.sort(trips,(a,b)->(a[1]!=b[1]?a[1]-b[1]:a[2]-b[2]));
        int i,n=trips.length;
        int a[]=new int[1001];
        Arrays.fill(a,0);
        for(int x[]:trips)
        {
            a[x[1]]+=x[0];
            a[x[2]]-=x[0];
        }
        int seats=0;
        for(i=0;i<1001;i++)
        {
            seats+=a[i];
            if(seats>cap)
                return false;
        }
        return true;
    }
}
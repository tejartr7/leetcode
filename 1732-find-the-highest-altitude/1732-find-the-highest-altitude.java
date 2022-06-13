class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int i;
        int []a=new int[l+1];
        Arrays.fill(a,0);
     //   a[0]=0;
        int k=0;
        for(i=1;i<l+1;i++)
        { 
            a[i]=gain[k]+a[i-1];
            k++;
        }
        Arrays.sort(a);
        return a[l];
    }
}
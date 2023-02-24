class Solution {
    public boolean checkSetBit(int n,int i)
    {
        n=n>>i;
        return n%2==1;
    }
    public int largestCombination(int[] c) {
        int a[]=new int[32];
        int i,j,n=c.length;
        for(i=0;i<32;i++)
        {
            for(j=0;j<n;j++)
            {
                if(checkSetBit(c[j],i))
                {
                    a[i]++;
                }
            }
        }
        int maxi=0;
        for(i=0;i<32;i++)
        {
            maxi=Math.max(maxi,a[i]);
        }
        return maxi;
    }
}
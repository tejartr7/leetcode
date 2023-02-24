class Solution {
    public boolean checkSetBit(int n,int i)
    {
        n=n>>i;
        return n%2==1;
    }
    public int largestCombination(int[] c) {
        int maxi=0;
        int i,j,n=c.length;
        for(i=0;i<32;i++)
        {   int count=0;
            for(j=0;j<n;j++)
            {
                if(checkSetBit(c[j],i))
                {
                   count++;
                }
            }
            maxi=Math.max(maxi,count);
        }
        return maxi;
    }
}
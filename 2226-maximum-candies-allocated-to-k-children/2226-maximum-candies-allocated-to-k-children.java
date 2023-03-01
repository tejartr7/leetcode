class Solution {
    public int maximumCandies(int[] candies, long k) {
        int i,n=candies.length;
        int sum=0;
        for(i=0;i<n;i++)
            sum+=candies[i];
        int l=0,h=100000000;
        while(l<h)
        {
            int mid=(l+h+1)/2;
            long count=0;
            for(int x:candies)
            {
                count+=x/mid;
            }
            if(k>count)
                h=mid-1;
            else
                l=mid;
        }
        return l;
    }
}
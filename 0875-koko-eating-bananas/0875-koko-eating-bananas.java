class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //we will use binary search 
        //so sort the array first
        Arrays.sort(piles);
        int i,n=piles.length;
        //initialise low and high
        int lo=0,hi=piles[n-1];
        if(n==1)
        {
            int count=piles[0]/h;
            if(piles[0]%h>0)
                count++;
            return count;
        }
        while(lo<=hi)
        {
            int count=0;
            int mid=lo+(hi-lo)/2;
            if(mid==0)
                break;
            for(int x:piles)
            {
                count+=x/mid;
                if(x%mid>0)
                    count++;
            }
            if(count<=h)
            {
                hi=mid-1;
            }
            else
                lo=mid+1;
        }
        //ans will be stored in low
        return lo;
    }
}
class Solution {
    public long repairCars(int[] ranks, int cars) {
        long l=1l,r=100l*cars*cars;
        while(l<r)
        {
            long curr=0;
            long mid=(l+r)/2l;
            for(int x:ranks)
            {
                curr+=(long)(Math.sqrt(mid/(long)x));
            }
            if(curr<cars)
                l=mid+1;
            else
                r=mid;
        }
        return l;
    }
}
class pair
{
    long sum;
    long count;
    pair(long x,long y)
    {
        sum=x;
        count=y;
    }
}
class Solution {
    public long[] getDistances(int[] arr) {
        int i,n=arr.length;
        long ans[]=new long[n];
        Map<Integer,pair> prev=new HashMap<>();
        Map<Integer,pair> curr=new HashMap<>();
        for(i=0;i<n;i++)
        {
            if(!prev.containsKey(arr[i]))
            {
                prev.put(arr[i],new pair(0l,0l));
            }
            if(!curr.containsKey(arr[i]))
                curr.put(arr[i],new pair(0l,0l));
            pair r=curr.get(arr[i]);
            curr.put(arr[i],new pair(r.sum+i,r.count+1));
        }
        for(i=0;i<n;i++)
        {
            pair a=prev.get(arr[i]);
            pair b=curr.get(arr[i]);
            long val=0;
            val+=(long)((long)i*(long)a.count-(long)a.sum);
            val+=(long)((long)b.sum-(long)i*(long)b.count);
            prev.put(arr[i],new pair(a.sum+i,a.count+1));
            curr.put(arr[i],new pair(b.sum-i,b.count-1));
            ans[i]=val;
        }
        return ans;
    }
}
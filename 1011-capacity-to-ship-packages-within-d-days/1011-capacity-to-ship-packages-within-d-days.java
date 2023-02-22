class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int start=0,end=0;
        for(int x:weights)
        {
            start=Math.max(x,start);
            end+=x;
        }
        int n=weights.length;
        while(start<end)
        {
            int i=0,j=n-1;
            int mid=(end+start)/2;
            //System.out.print(mid+" ");
            int count=1;
            int sum=0;
            while(i<n)
            {
                sum+=weights[i];
                if(sum>mid)
                {
                    count++;
                    sum=weights[i];
                }
                i++;
            }
            if(count<=days)
            {
                end=mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return start;
    }
}
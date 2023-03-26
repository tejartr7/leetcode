class Solution {
    public List<Long> minOperations(int[] nums, int[] q) {
        List<Long> list=new ArrayList<>();
        int i,n=nums.length;
        //long sum=0;
        Arrays.sort(nums);
        long pre[]=new long[n];
        long suff[]=new long[n];
        suff[n-1]=nums[n-1];
        pre[0]=nums[0];
        
        for(i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+nums[i];
        }
        
        for(i=n-2;i>=0;i--)
            suff[i]=suff[i+1]+nums[i];
        
        for(i=0;i<q.length;i++)
        {
            int l=0,h=n-1;
            long sum=0;
            while(l<h)
            {
                int mid=(l+h)/2;
                if(nums[mid]<=q[i])
                    l=mid+1;
                else h=mid;
            }
            sum+=l>0?(Math.abs((long)l*(long)q[i])-pre[l-1]):0;
            sum+=l<n?Math.abs(suff[l]-(long)(n-l)*(long)q[i]):0;
            list.add(sum);
        }
        return list;
    }
}
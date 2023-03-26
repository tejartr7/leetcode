class Solution {
    public int minMoves2(int[] nums) {
        int i,n=nums.length;
        Arrays.sort(nums);
        long pre[]=new long[n];
        long suff[]=new long[n];
        pre[0]=suff[n-1]=0;
        for(i=1;i<n;i++)
            pre[i]=pre[i-1]+nums[i-1];
        for(i=n-2;i>=0;i--)
            suff[i]=suff[i+1]+nums[i+1];
        long ans=Long.MAX_VALUE;
        for(i=0;i<n;i++)
        {
            long sum=Math.abs(pre[i]-(long)i*(long)nums[i]);
            sum+=Math.abs(suff[i]-(long)(n-1-i)*(long)nums[i]);
            //System.out.print(sum+" ");
            ans=Math.min(ans,sum);
        }
        return (int)ans;
    }
}
class Solution {
    public int maxSumMinProduct(int[] nums) {
        long ans=0;
        long mod=1000_000_007;
        int i,n=nums.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
        long sum[]=new long[n];
        sum[0]=nums[0];
        for(i=1;i<n;i++)
            sum[i]=sum[i-1]+nums[i];
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        for(i=0;i<n;i++)
        {
            while(stack.peek()!=-1 && nums[stack.peek()]>=nums[i])
                stack.pop();
            pre[i]=stack.peek();
            stack.push(i);
        }
        stack.clear();
        stack.push(n);
        for(i=n-1;i>=0;i--)
        {
            while(stack.peek()!=n && nums[stack.peek()]>=nums[i])
                stack.pop();
            suff[i]=stack.peek();
            stack.push(i);
        }
        for(i=0;i<n;i++)
        {
            long x=pre[i]==-1?0:sum[pre[i]];
            long y=suff[i]==n?sum[n-1]:sum[suff[i]]-(long)nums[suff[i]];
            ans=Math.max(ans,((y-x)*(long)nums[i]));
        }
        return (int)(ans%mod);
    }
}
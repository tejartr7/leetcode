class Solution {
    public int[] leftRigthDifference(int[] nums) {
        int i,n=nums.length;
        int pre[]=new int[n];
        int suff[]=new int[n];
        pre[0]=suff[n-1]=0;
        for(i=1;i<n;i++)
        {
            pre[i]=pre[i-1]+nums[i-1];
        }
        for(i=n-2;i>=0;i--)
            suff[i]=suff[i+1]+nums[i+1];
        for(i=0;i<n;i++)
            suff[i]=Math.abs(suff[i]-pre[i]);
        return suff;
    }
}
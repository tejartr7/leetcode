class Solution {
    int ans=0;
    public int helper(int i,int n,int cost[])
    {
        if(i>=n)
            return 0;
        int l=helper(2*i+1,n,cost);
        int r=helper(2*i+2,n,cost);
        ans+=Math.abs(l-r);
        return cost[i]+Math.max(l,r);
    }
    public int minIncrements(int n, int[] cost) {
        int i;
        if(n==1)
            return 0;
        helper(0,n,cost);
        return ans;
    }
}
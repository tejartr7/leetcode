class Solution {
    int dp[];
    public int helper(int idx,int[][] pairs)
    {
        int n=pairs.length;
        if(idx>=n)
            return 0;
        if(dp[idx]!=-1)
            return dp[idx];
        dp[idx]=1;
        for(int x=idx+1;x<n;x++)
            if(pairs[idx][1]<pairs[x][0])
            dp[idx]=Math.max(dp[idx],1+helper(x,pairs));
        return dp[idx];
        
    }
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[0]-b[0]);
       
        int i,j,n=pairs.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        int ans=1;
        for(i=0;i<n;i++)
            {//Arrays.fill(dp,-1);
            ans=Math.max(ans,helper(i,pairs));}
        return ans;
    }
}
class Solution {
    public int firstDayBeenInAllRooms(int[] next) {
        int i,j,n=next.length;
        long mod=1000_000_007l;
        long dp[]=new long[n];
        dp[0]=0;
        for(i=1;i<n;i++)
        {
            if(next[i-1]==i-1)
            {
                dp[i]=(dp[i-1]+2)%mod;
            }
            else
            {
                dp[i]=(dp[i-1]+dp[i-1]+2-dp[next[i-1]]+mod)%mod;
            }
        }
        return (int)(dp[n-1]%mod);
    }
}
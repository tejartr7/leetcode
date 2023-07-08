class Solution {
    public int minimumDeletions(String s) {
        int a=0,b=0;
        int i,n=s.length();
        int x=-1,y=-1;
        int dp[]=new int[n+1];
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='a')
            {
                dp[i+1]=Math.min(dp[i]+1,b);
            }
            else
            {
                b++;
                dp[i+1]=dp[i];
            }
        }
        return dp[n];
    }
}
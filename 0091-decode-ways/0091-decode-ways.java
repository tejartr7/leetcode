// Optimal
class Solution {
    public int helper(String s,int index,int []dp)
    {
        if(index>=s.length())
            return 1;
        if(dp[index]!=-1)
            return dp[index];
        int ans=0;
        int op1=s.charAt(index)-'0';
        int op2=0;
        if(index+1<s.length())
        {
            op2=op1*10+s.charAt(index+1)-'0';
        }
        if(op1>0)
            ans+=helper(s,index+1,dp);
        if(op1>0 && op2>0 && op2<=26)
            ans+=helper(s,index+2,dp);
        return dp[index]=ans;
    }
    public int numDecodings(String s) {
      int i,n=s.length();
      int dp[]=new int[101];
      Arrays.fill(dp,-1);
      return helper(s,0,dp);
    }
}

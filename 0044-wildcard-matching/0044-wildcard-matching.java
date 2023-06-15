class Solution {
    public boolean helper(String a,String b,int i,int j,Integer dp[][])
    {
        if(i<0) return j<0;
        if(j<0)
        {
            for(int k=i;k>=0;k--)
            {
                if(a.charAt(k)!='*')
                    return false;
            }
            return true;
        }
        if(dp[i][j]!=null) return dp[i][j]==1;
        boolean result=false;
        if(a.charAt(i)==b.charAt(j) || a.charAt(i)=='?')
            result=helper(a,b,i-1,j-1,dp);
        if(a.charAt(i)=='*')
            result=helper(a,b,i-1,j,dp)|helper(a,b,i,j-1,dp);
        dp[i][j]=result?1:0;
        return result;
    }
    public boolean isMatch(String s, String p) {
        Integer dp[][]=new Integer[p.length()][s.length()];
        int i;
        return helper(p,s,p.length()-1,s.length()-1,dp);   
    }
}
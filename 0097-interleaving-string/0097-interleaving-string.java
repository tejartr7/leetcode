class Solution {
    int dp[][];
    public boolean helper(int i,int j,int idx,String s1, String s2, String s3)
    {
        int m=s1.length(),n=s2.length();
        if(i==m && j==n)
        {
            return true;
        }
        boolean valid=false;
        if(dp[i][j]!=-1)
            return dp[i][j]==1;
        if(i<m && s1.charAt(i)==s3.charAt(idx))
            valid|=helper(i+1,j,idx+1,s1,s2,s3);
        if(j<n && s2.charAt(j)==s3.charAt(idx))
            valid|=helper(i,j+1,idx+1,s1,s2,s3);
        dp[i][j]=valid?1:0;
        return valid;
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        dp=new int[s1.length()+1][s2.length()+1];
        if(s3.length()!=s1.length()+s2.length())
            return false;
        for(int x[]:dp)
            Arrays.fill(x,-1);
        return helper(0,0,0,s1,s2,s3);
    }
}
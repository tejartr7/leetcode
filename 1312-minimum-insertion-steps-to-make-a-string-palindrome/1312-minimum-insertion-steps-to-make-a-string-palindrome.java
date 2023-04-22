class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int i,j,n1=text1.length(),n2=text2.length();
        int dp[][]=new int[n1+1][n2+1];
        for(i=0;i<n1;i++)
            dp[i][0]=0;
        for(j=0;j<n2;j++)
        {
           dp[0][j]=0;
        }
        for(i=1;i<=n1;i++)
        {
            for(j=1;j<=n2;j++)
            {
                if(text1.charAt(i-1)!=text2.charAt(j-1))
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                else
                {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
            }
        }
        return dp[n1][n2];
    }
    public int minInsertions(String s) {
        char ch[]=s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j)
        {
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        return s.length()-longestCommonSubsequence(s,new String(ch));
    }
}
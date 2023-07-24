class Solution {
    //int dp[];
    
    public boolean wordBreak(String s, List<String> wordDict) {
        int i,j,n=s.length();
        boolean dp[]=new boolean[n+1];
        dp[0]=true;
        Set<String> set=new HashSet<>();
        for(String x:wordDict)
            set.add(x);
        for(i=1;i<=n;i++)
        {
            for(j=0;j<i;j++)
            {
                String sub=s.substring(j,i);
                if(dp[j] && set.contains(sub))
                {
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
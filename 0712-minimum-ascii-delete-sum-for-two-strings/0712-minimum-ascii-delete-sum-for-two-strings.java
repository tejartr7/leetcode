class Solution {
    int dp[][];
    public int helper(int i,int j,char ch1[],char ch2[])
    {
        if(i>=ch1.length && j>=ch2.length)
            return 0;
        if(dp[i][j]!=-1)
            return dp[i][j];
        int x=1000_000_000;
        if(i<ch1.length && j<ch2.length && ch1[i]==ch2[j])
        {
            x=helper(i+1,j+1,ch1,ch2);
            return dp[i][j]=x;
        }
        
        int p=1000_000_000;
        int q=1000_000_000;
        int r=1000_000_000;
        if(i<ch1.length)
            p=(int)(ch1[i])+helper(i+1,j,ch1,ch2);
        if(j<ch2.length)
            q=(int)(ch2[j])+helper(i,j+1,ch1,ch2);
        if(i<ch1.length && j<ch2.length)
            r=(int)(ch1[i]+ch2[j])+helper(i+1,j+1,ch1,ch2);
        x=Math.min(p,Math.min(q,r));
        return dp[i][j]=x;
    }
    public int minimumDeleteSum(String s1, String s2) {
        dp=new int[s1.length()+1][s2.length()+1];
        for(int row[]:dp)
            Arrays.fill(row,-1);
        return helper(0,0,s1.toCharArray(),s2.toCharArray());
    }
}
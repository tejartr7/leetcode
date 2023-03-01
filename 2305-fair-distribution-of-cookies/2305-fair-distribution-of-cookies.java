class Solution {
    int mini=Integer.MAX_VALUE;
    public void backTrack(int dp[],int []c,int index)
    {
        if(index>=c.length)
        {
            int max=0;
            for(int x:dp)
            {
                max=Math.max(max,x);
            }
            mini=Math.min(mini,max);
            return ;
        }
        for(int i=0;i<dp.length;i++)
        {
            dp[i]+=c[index];
            backTrack(dp,c,index+1);
            dp[i]-=c[index];
        }
    }
    public int distributeCookies(int[] cookies, int k) {
        int dp[]=new int[k];
        Arrays.fill(dp,0);
        backTrack(dp,cookies,0);
        return mini;
    }
}
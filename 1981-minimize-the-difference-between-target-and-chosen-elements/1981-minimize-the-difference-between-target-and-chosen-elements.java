class Solution {
    int maxi=Integer.MAX_VALUE;
    int dp[][];
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public int helper(int mat[][],int t,int i,int sum)
    {
        int m=mat.length,n=mat[0].length;
        if(i==m)
        {
            return Math.abs(t-sum);
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        int res=Integer.MAX_VALUE;
        int x;
        for(x=0;x<n;x++)
            res=Math.min(res,helper(mat,t,i+1,sum+mat[i][x]));
        return dp[i][sum]=res;
    }
    public int minimizeTheDifference(int[][] mat, int target) {
        int i,j,m=mat.length,n=mat[0].length;
        dp=new int[m][4901];
        for(i=0;i<m;i++)
            Arrays.fill(dp[i],-1);
        return helper(mat,target,0,0);
       // return dp[m-1][n-1];
    }
}
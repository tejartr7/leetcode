class Solution {
    public int helper(int row,int col,List<List<Integer>> triangle,int dp[][])
    {
        int ans=0;
        if(row>=triangle.size() || col>=triangle.get(row).size())
            return 0;
        if(dp[row][col]!=-1)
            return dp[row][col];
        ans+=triangle.get(row).get(col);
        int x=helper(row+1,col+1,triangle,dp);
        int y=ans+x;
        int z=ans+helper(row+1,col,triangle,dp);
        return dp[row][col]=Math.min(y,z);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int dp[][]=new int[triangle.size()][triangle.size()];
        for(int i=0;i<triangle.size();i++)
            Arrays.fill(dp[i],-1);
        return helper(0,0,triangle,dp);
    }
}
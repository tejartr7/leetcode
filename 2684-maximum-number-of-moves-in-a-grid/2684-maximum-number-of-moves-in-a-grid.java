
class Solution {
    public boolean valid(int i,int j,int m,int n)
    {
        return i>=0 && i<m && j>=0 && j<n;
    }
    public int maxMoves(int[][] grid) {
        int maxi=0;
        int i,j,m=grid.length,n=grid[0].length;
        
        int dp[][]=new int[m][n];
        for(i=0;i<m;i++)
        Arrays.fill(dp[i],0);
        for(j=n-2;j>=0;j--)
        {
            for(i=0;i<m;i++)
            {
                int temp=0;
                if(valid(i-1,j+1,m,n) && grid[i-1][j+1]>grid[i][j])
                {
                    temp=Math.max(temp,dp[i-1][j+1]+1);
                }
                
                if(valid(i,j+1,m,n) && grid[i][j+1]>grid[i][j])
                {
                    temp=Math.max(temp,dp[i][j+1]+1);
                }
                
                if(valid(i+1,j+1,m,n) && grid[i+1][j+1]>grid[i][j])
                {
                    temp=Math.max(temp,dp[i+1][j+1]+1);
                }
                dp[i][j] = temp;
            }
        }
        j=0;
        for(i=0;i<m;i++)
            maxi=Math.max(maxi,dp[i][j]);
        return maxi;
    }
}
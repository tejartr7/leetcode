class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        int i,j;
        int l1=grid.length;
        int l2=grid[0].length;
        for(i=0;i<l1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(grid[i][j]<0)
                    count++;
            }
        }
        return count;
        
    }
}
class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer> r=new HashMap<>();
        Map<String,Integer> c=new HashMap<>();
        int i,j,m=grid.length,n=grid[0].length;
        for(i=0;i<m;i++)
        {
            String row="";
            for(j=0;j<n;j++)
            {
                row+=grid[i][j];
                row+=" ";
            }
            r.put(row,r.getOrDefault(row,0)+1);
        }
        for(j=0;j<n;j++)
        {
            String col="";
            for(i=0;i<m;i++)
            {
                col+=grid[i][j];
                col+=" ";
            }
            c.put(col,c.getOrDefault(col,0)+1);
        }
        int ans=0;
        for(String x:r.keySet())
        {
            if(c.containsKey(x))
                ans+=c.get(x)*r.get(x);
        }
        return ans;
    }
}
class Solution {
    public long matrixSumQueries(int n, int[][] q) {
        long ans=0;
        int i,j;
        boolean row[]=new boolean[n];
        boolean col[]=new boolean[n];
        int r=n,c=n;
        for(i=q.length-1;i>=0;i--)
        {
            if(r==0 || c==0)
                break;
            if(q[i][0]==0)
            {
                if(row[q[i][1]])
                    continue;
                r--;
                row[q[i][1]]=true;
                //if(r==0) break;
                ans+=q[i][2]*c;
            }
            else
            {
               if(col[q[i][1]])
                    continue;
                c--;
                col[q[i][1]]=true;
                ans+=q[i][2]*r; 
            }
        }
        return ans;
    }
}
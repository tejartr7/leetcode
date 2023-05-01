class Solution {
    int cnt=0;
    public boolean inRange(int[] a, int[] b) {
        long dx = a[0] - b[0], dy = a[1] - b[1], r = a[2];
        return dx * dx + dy * dy <= r * r;
    }
    public void dfs(int i,int [][]bombs,boolean visited[])
    {
        cnt++;
        visited[i]=true;
        for(int j=0;j<bombs.length;j++)
        {
            if(!visited[j] && inRange(bombs[i],bombs[j]))
            {
                dfs(j,bombs,visited);
            }
        }
    }
    public int maximumDetonation(int[][] bombs) {
        int i,n=bombs.length;
        int maxi=0;
        for(i=0;i<n;i++)
        {
            cnt=0;
            dfs(i,bombs,new boolean[n]);
            maxi=Math.max(maxi,cnt);
        }
        return maxi;
    }
}
class Solution {
    int count=-1;
    public void dfs(int i,int parent,int dp[],boolean visited[],int edges[])
    {
        if(edges[i]==-1) return ;
        if(visited[i])
        {
            if(i==parent)
            count=Math.max(dp[0],count);
            return ;
        }
        dp[0]+=1;
        visited[i]=true;
        dfs(edges[i],parent,dp,visited,edges);
        visited[i]=false;
    }
    public int longestCycle(int[] edges) {
        int i,n=edges.length;
        boolean visited[]=new boolean[n];
        for(i=0;i<n;i++)
        {
            if(!visited[i])
            {
                int dp[]=new int[1];
                dp[0]=0;
                dfs(i,i,dp,visited,edges);
                visited[i]=true;
            }
        }
        return count;
    }
}
class Solution{
    int maxi=0;
    int dp[][];
    public int helper(int idx,int prev,int event[][],int k)
    {
        if(k==0) return 0;
        if(idx>=event.length) return 0;
        int take=0,not=0;
        int i;
        if(dp[idx][k] != -1) {
            return dp[idx][k];
        }
        for(i=idx;i<event.length;i++)
        {
            if(event[i][0]>event[idx][1])
            break;
        }
        take=event[idx][2]+helper(i,prev,event,k-1);
        not=helper(idx+1,prev,event,k);
        return dp[idx][k]=Math.max(take,not);
    }
    public int maxValue(int[][] events, int k) {
        Arrays.sort(events,(a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]);
        dp=new int[events.length+1][k+1];
        int i;
        for(i=0;i<dp.length;i++)
        Arrays.fill(dp[i],-1);
        return helper(0,-1,events,k);
    }
}
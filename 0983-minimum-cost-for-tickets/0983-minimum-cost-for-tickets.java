class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[366];
        //Arrays.fill(dp,Integer.MAX_VALUE);
        int i,j;
        Set<Integer> passDays=new HashSet<>();
        //dp[0]=0;
        for(int x:days)
            passDays.add(x);
        for(i=1;i<=365;i++)
        {
            if(!passDays.contains(i))
            {
                dp[i]=dp[i-1];
            }
            else
            {
                dp[i]=Math.min(dp[i-1]+costs[0],Math.min(dp[Math.max(0,i-7)]+costs[1],dp[Math.max(0,i-30)]+costs[2]));
            }
        }
        return dp[365];
    }
}
class Solution {
    int dp[][]=new int[21][100001];
    int tallestBillboard(int[] rods) {
        for(int i=0;i<=20;i++)
        Arrays.fill(dp[i],-1);
        return helper(rods,0,0);    
    }

   int helper(int r[],int i,int var)
   {
       if(i==r.length)
       {
           if(var==0) return 0;
           return Integer.MIN_VALUE;
       }
       if(dp[i][var+5000]!=-1) return dp[i][var+5000];
       int a=r[i]+helper(r,i+1,var+r[i]);
       int b=helper(r,i+1,var-r[i]);
       int c=helper(r,i+1,var);
       return dp[i][var+5000]=Math.max(a,Math.max(b,c));
       //return dp[i][var+5000];
   }
}

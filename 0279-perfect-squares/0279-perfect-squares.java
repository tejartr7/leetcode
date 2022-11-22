class Solution {
    public int fun(int n,int ans[])
    {
        int x=(int)Math.sqrt(n);
        if(x*x==n)
        {   ans[n]=1;
            return 1;
        }
        int min=Integer.MAX_VALUE;
        int i=1;
        while(i<=x)
        {
           int val=1+ans[n-i*i];
           i++;
           min=Math.min(min,val);
        }
        return min;
    }
    public int numSquares(int n) {
        if(n<=3)
            return n;
        int i;
         int ans[]=new int[n+1];
         ans[0]=1;
         ans[1]=1;
         ans[2]=2;
         ans[3]=3;
        for(i=4;i<=n;i++)
        {
            ans[i]=fun(i,ans);
        }
        return ans[n];
    }
}
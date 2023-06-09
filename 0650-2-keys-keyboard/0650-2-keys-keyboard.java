class Solution {
    int mini=Integer.MAX_VALUE;
    public boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
 
        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;
 
        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;
 
        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
 
        return true;
    }
    public void helper(int curr,int copy,int steps,int n)
    {
        if(curr==n)
        {
            mini=Math.min(mini,steps);
            return ;
        }
        
    }
    public int minSteps(int n) {
        //helper(1,0,0,n);
        if(isPrime(n))
            return n;
        int dp[]=new int[n+1];
        Arrays.fill(dp,1000000);
        int i;
        for(i=0;i<=Math.min(5,n);i++)
        {
            dp[i]=i;
        }
        dp[1]=0;
        if(n<=5)
            return dp[n];
        for(i=6;i<=n;i++)
        {
            int x,y;
            for(x=2;x*x<=i;x++)
            {
                if(i%x==0)
                {
                    dp[i]=Math.min(dp[i],dp[i/x]+dp[x]);
                }
            }
            if(isPrime(i))
                dp[i]=i;
        }
        return dp[n];
    }
}
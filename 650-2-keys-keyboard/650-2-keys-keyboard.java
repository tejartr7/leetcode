class Solution {
     public int gpf(int n)
     {   int ans=1;
         int i;
         for(i=2;i<n;i++)
         {
             if(n%i==0)
             {
                     ans=i;
             }
         }
      return ans;
     }
     public boolean isPrime(int n)
    {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public int minSteps(int n) {
        int min=0;
        if(n==1)
            return 0;
        else if((n&1)==0)
        {
            return min+2+minSteps(n/2);
        }
        else if(isPrime(n))
            return n;
        else
        {
            int x=gpf(n);
            return minSteps(x)+n/x;
        }    
         
    }
}
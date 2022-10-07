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
 
        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;
 
        // Check if number is 2
        else if (n == 2)
            return true;
 
        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;
 
        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public boolean isPerfectSquare(int n)
    {
        int x=(int)Math.sqrt(n);
        if(n==x*x)
            return true;
        return false;
    }
    public int minSteps(int n) {
        int min=0;
        if(n==1)
            return 0;
       
        if((n&1)==0)
        {
            return min+2+minSteps(n/2);
        }
        if(isPrime(n))
            return n;
        else
        {
            int x=gpf(n);
            return minSteps(x)+n/x;
        }    
         
    }
}
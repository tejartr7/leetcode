class Solution {
    public double myPow(double x, int n) {
      if(x==1.0 || n==0)
          return 1;
       
        if(n%2==0)
            return myPow(x*x,n/2);
        else if(n%2==1)
            return myPow(x,n-1)*x;
	  
         
            return 1/myPow(x,-n);
    }
}
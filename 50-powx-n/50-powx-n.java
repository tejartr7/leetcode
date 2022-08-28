class Solution {
    public double myPow(double x, int n) {
        if(n==0 || x==1.0)
            return (double)1;
        else if(n%2==1)
        {
            return myPow(x*x,n/2)*x;
        }
        else if(n%2==0)
            return myPow(x*x,n/2);
        else
            return 1/myPow(x,-n);
            
    }
}
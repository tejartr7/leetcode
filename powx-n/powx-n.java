class Solution {
    public double myPow(double x, int n) {
       double k=1;
        if(x==1)
            return 1.00000;
        if(n==-2147483648 && x!=-1)
            return 0.00000;
      k=Math.pow(x,n);
      
        return k;
    }
}
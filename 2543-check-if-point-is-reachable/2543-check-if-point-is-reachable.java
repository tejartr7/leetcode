class Solution {
    public int gcd(int x,int y)
    {
        if(y==0)
        return x;
        return gcd(y,x%y);
    }
    public boolean isReachable(int x, int y) {
       int g=gcd(x,y);
       while(g%2==0)
       g=g/2;
       return g==1;
    }
}
class Solution {
    long m=1000_000_007;
    public long pow(int x,int n)
    {
        if(x==1)
            return 1;
        if(n==1)
            return x;
        long p=pow(x,n/2)%m;
        if(n%2==1)
            return x%m*p%m*p%m;
        return p%m*p%m;
    }
    public int monkeyMove(int n) {
        long k=pow(2,n);
        return (int)((k-2+m)%m);
    }
}
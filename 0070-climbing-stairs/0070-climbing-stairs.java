class Solution {
    public int climbStairs(int n) {
        if(n==1)
            return 1;
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
            int temp1=a+b;
            b=temp1;
            a=temp1-a;
        }
        return b;
    }
}
class Solution {
    public boolean a(int x)
    {
        if(x<0)
            return false;
        if(x==0)
            return true;
        int sum=0;
        int b=x;
        while(x>0)
        {
          int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(b==sum)
            return true;
        return false;
    }
    public boolean isPalindrome(int x) {
       return a(x);
    }
}
class Solution {
    public boolean ispal(String s)
    {
        int i=0,n=s.length()-1;
        while(i<n)
        {
            if(s.charAt(i)!=s.charAt(n))
            return false;
            i++;
            n--;
        }
        return true;
    }
    public String base(int n,int b)
    {
        String t="";
        while(n>0)
        {
            t+=String.valueOf(n%b);
            n/=b;
        }
        return t;
    }
    public boolean isStrictlyPalindromic(int n) {
        int i;
        for(i=2;i<=n-2;i++)
        {
            String k=base(n,i);
            if(!ispal(k))
            return false;
        }
        return true;
    }
}
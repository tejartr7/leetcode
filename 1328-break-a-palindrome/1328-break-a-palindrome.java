class Solution {
    public String breakPalindrome(String p) {
        int n=p.length();
        if(n==1)
            return "";
        char []c=p.toCharArray();
        int i;
        boolean x=false;
        for(i=0;i<n;i++)
        {
            if(c[i]!='a' && i!=n/2)
            {
                c[i]='a';
                x=true;
                break;
            }
        }
        if(x==false)
        {
            c[n-1]='b';
        }
        return new String(c);
    }
}
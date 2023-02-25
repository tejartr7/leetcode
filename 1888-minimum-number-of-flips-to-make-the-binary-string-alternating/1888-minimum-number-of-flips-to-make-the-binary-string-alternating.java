class Solution {
    public int minFlips(String s) {
        int l=s.length();
        s=s+s;
        char ch[]=s.toCharArray();
        int i,j,n=s.length();
        char a[]=new char[n];
        char b[]=new char[n];
        for(i=0;i<n;i++)
        {
            if(i%2==0)
            {
                a[i]='0';
                b[i]='1';
            }
            else
            {
                a[i]='1';
                b[i]='0';
            }
        }
        int count1=0,count2=0;
        int mini=1000_000;
        i=0;j=0;
        while(j<n)
        {
            if(ch[j]!=a[j])
                count1++;
            if(ch[j]!=b[j])
                count2++;
            if(j-i+1>l)
            {
                if(ch[i]!=a[i])
                count1--;
                if(ch[i]!=b[i])
                count2--;
                i++;
            }
            if(j-i+1==l)
            mini=Math.min(mini,Math.min(count1,count2));
            j++;
        }
        return mini;
    }
}
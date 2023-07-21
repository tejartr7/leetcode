class Solution {
    public boolean valid(int a[],int b[])
    {
        int i;
        for(i=0;i<52;i++)
        {
            if(a[i]<b[i])
                return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        if(s.equals(t)) return s;
        if(s.contains(t)) return t;
        if(s.length()<t.length()) return "";
        int i=0,j=0;
        int k=0;
        int n=s.length(),m=t.length();
        String ans="";
        int len=Integer.MAX_VALUE;
        int a[]=new int[52];
        int b[]=new int[52];
        for(i=0;i<m;i++)
        {
            char ch=t.charAt(i);
            if(Character.isUpperCase(ch))
            b[ch-'A']++;
            else 
                b[ch-'a'+26]++;
        }
        i=0;
        while(j<n)
        {
            char ch=s.charAt(j);
            if(Character.isUpperCase(ch))
            a[ch-'A']++;
            else 
                a[ch-'a'+26]++;
            while(i<n && valid(a,b))
            {
                if(j-i+1<len)
                {
                    len=j-i+1;
                    ans=s.substring(i,j+1);
                }
                ch=s.charAt(i);
                if(Character.isUpperCase(ch))
                a[ch-'A']--;
                else 
                a[ch-'a'+26]--;
                i++;
            }
            j++;
        }
        return ans;
    }
}
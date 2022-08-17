class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        int i;
        int l=a.length;
        int x=0;
        for(i=0;i<l;i++)
        {
            if(a[i]!=b[i])
                x++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        String k=new String(a);
        String kk=new String(b);
        if(!k.equals(kk))
            return false;
         if(s1.equals(s2))
            return true;
        else if(s1.length()!=s2.length())
            return false;
        else if(x==2)
            return true;
        return false;
        
    }
}
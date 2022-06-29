class Solution {
    public boolean checkOnesSegment(String s) {
      int i;
      char c[]=s.toCharArray();
      int l=c.length;
        if(l==1 && c[0]=='1')
            return true;
       if(l==2 && c[0]=='1')
           return true;
       for(i=1;i<l;i++)
       {
           if(c[i]=='1' && c[i-1]=='0')
               return false;
       }
        return true;
    }
}
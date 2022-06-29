class Solution {
    public boolean checkOnesSegment(String s) {
      int i;
      char c[]=s.toCharArray();
      int l=c.length;
      
       for(i=1;i<l;i++)
       {
           if(c[i]=='1' && c[i-1]=='0')
               return false;
       }
        return true;
    }
}
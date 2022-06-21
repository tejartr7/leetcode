class Solution {
    public boolean strongPasswordCheckerII(String a) {
      int i,j,l=a.length();
        boolean num=true,spec=true,lower=true,upper=true;
      
       if(l<8)
           return false;
      for(i=0;i<l;i++)
      {
          char c=a.charAt(i);
          String s=Character.toString(c);
          if(i+1<l && a.charAt(i)==a.charAt(i+1))
              return false;
          if(c>='0' && c<='9')
              num=false;
          if(c>='a' && c<='z')
              lower=false;
           if(c>='A' && c<='Z')
              upper=false;
           if("!@#$%^&*()-+".contains(s))
              spec=false;
          
      }
        if(!num && !spec && !lower &&!upper)
            return true;
        return false;
    }
}
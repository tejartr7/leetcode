class Solution {
    public boolean strongPasswordCheckerII(String a) {
      int i,j,l=a.length();
        boolean num=false,spec=false,lower=false,upper=false;
        boolean adj=false;
       if(l<8)
           return false;
      for(i=0;i<l;i++)
      {
          char c=a.charAt(i);
          String s=Character.toString(c);
          if(i+1<l && a.charAt(i)==a.charAt(i+1))
              return false;
          if(c>='0' && c<='9')
              num=true;
          if(c>='a' && c<='z')
              lower=true;
           if(c>='A' && c<='Z')
              upper=true;
           if("!@#$%^&*()-+".contains(s))
              spec=true;
          
      }
        if(num && spec && lower &&upper)
            return true;
        return false;
    }
}
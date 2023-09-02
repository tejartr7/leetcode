class Solution {
    public boolean helper(int idx,char[] ch,String s)
    {
        String temp=new String(ch);
        if(idx>=2)
        {
            return temp.equals(s);
        }
        if(temp.equals(s))
            return true;
       
            char t=ch[idx];
            ch[idx]=ch[idx+2];
            ch[idx+2]=t;
            boolean x=helper(idx+1,ch,s);
            t=ch[idx];
            ch[idx]=ch[idx+2];
            ch[idx+2]=t;
            x|=helper(idx+1,ch,s);
            return x;
    }
    public boolean canBeEqual(String s1, String s2) {
      char ch[]=s1.toCharArray();
      return helper(0,ch,s2);
    }
}
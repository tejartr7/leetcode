class Solution {
    public int compress(char[] chars) {
        int i,n=chars.length;
        if(n<=1)
            return n;
        String s="";
        int count=1;
        for(i=1;i<n;i++)
        { 
            if(chars[i-1]==chars[i])
            {
                count++;
            
            }
            else
            {   if(count!=1)
                s+=String.valueOf(chars[i-1])+count;
                if(count==1)
                s+=String.valueOf(chars[i-1]);
                count=1;
            }
        }
        if(chars[n-1]!=chars[n-2])
        {
            s+=String.valueOf(chars[n-1]);
        }
        else
            s+=String.valueOf(chars[n-2])+count;
        System.out.println(s);
        for(i=0;i<s.length();i++)
        {
           chars[i]=s.charAt(i);
        }
        return s.length();
    }
}
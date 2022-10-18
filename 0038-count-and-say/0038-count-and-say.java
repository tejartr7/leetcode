class Solution {
    public String countAndSay(int num) {
        if(num==1)
            return "1";
        if(num==2)
            return "11";
        if(num==3)
            return "21";
        String x=countAndSay(num-1);
        int i,n=x.length();
        char chars[]=x.toCharArray();
        String s="";
        int count=1;
        for(i=1;i<n;i++)
        { 
            if(chars[i-1]==chars[i])
            {
                count++;
            
            }
            else
            {   
                s+=count+String.valueOf(chars[i-1]);
                count=1;
            }
        }
        if(chars.length>=2 && chars[n-1]!=chars[n-2])
        {
            s+="1"+String.valueOf(chars[n-1]);
        }
        else if(chars.length>=2)
            s+=count+String.valueOf(chars[n-2]);
        //System.out.println(s);
        return s;    
    }
}
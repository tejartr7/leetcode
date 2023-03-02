class Solution {
    public int compress(char[] chars) {
        int count=1;
        int i=0,n=chars.length;
        String ans="";
        if(n==1)
            return 1;
        //ans+=chars[0];
        for(i=1;i<n;i++)
        {
            if(chars[i-1]==chars[i])
            {
                count++;
            }
            else
            {
                if(count>1)
                ans+=chars[i-1]+String.valueOf(count);
                else
                ans+=chars[i-1];
                count=1;
            }
        }
        if(count>1)
        {
            ans+=chars[i-1]+String.valueOf(count);
        }
        else
        {
            ans+=chars[i-1];
        }
        //System.out.println(ans);
        for(i=0;i<ans.length();i++)
        {
            chars[i]=ans.charAt(i);
        }
        return ans.length();
    }
}
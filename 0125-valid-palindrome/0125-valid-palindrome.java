class Solution {
    public boolean isPal(String str)
    {
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        String str="";
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                str+=(char)(ch-'A'+'a');
            }
            else if(Character.isLowerCase(ch))
            {
                str+=ch;
            }
            else if(Character.isDigit(ch))
                str+=ch;
        }
        return isPal(str);
    }
}
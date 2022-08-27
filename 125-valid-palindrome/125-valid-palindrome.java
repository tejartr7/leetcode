class Solution {
    private boolean check(String s,int start,int end)
    {   
        if(s.length()==0)
            return true;
        if(start>=end)
        return true;
        else if(s.charAt(start)==s.charAt(end))
            return check(s,start+1,end-1);
        else if(!Character.isLetterOrDigit(s.charAt(start)))
        {
            return check(s,start+1,end);
        }
         else if(!Character.isLetterOrDigit(s.charAt(end)))
            return check(s,start,end-1);
        return false;
    }
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
    return check(s,0,s.length()-1);
    }
}
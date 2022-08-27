class Solution {
    public boolean isPalindrome(String s) {
     String p=s.toLowerCase();
       int start=0;
        int end=p.length()-1;
        while(start<=end)
        {
            
            if(!Character.isLetterOrDigit(p.charAt(start)))
                start++;
           else if(!Character.isLetterOrDigit(p.charAt(end)))
                end--;
            else{
           if(p.charAt(start)!=p.charAt(end))
                return false;
            start++;
            end--;
            }
        }
        return true;
    }
}
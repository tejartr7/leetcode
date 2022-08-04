class Solution {
 
    public boolean isPalindrome(int x) {
       if(x<0)
           return false;
        if(x==0)
            return true;
        
        char c[]=String.valueOf(x).toCharArray();
        int start=0;
        int end=c.length-1;
        while(start<=end)
        {
            if(c[start]!=c[end])
                return false;
            start++;
            end--;
        }
        return true;
    }
}
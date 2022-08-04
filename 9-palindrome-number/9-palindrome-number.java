class Solution {
    public boolean isPalindrome(int x) {
        int k=0;
        int l;
        int o=x;
        if(o==0)
        return true;
        if(x<0)
            return false;
        while(x>0)
        {
            l=x%10;
            k=k*10+l;
            x=x/10;
        }
        
        if(o==k)
            return true;
           
            return false;
        
    }
}
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        else
        {
            while(n>1)
            {
                if(n%4==0)
                {
                 n=n/4;
                }
                else
                    return false;
            }
            if(n==1)
                return true;
            else 
                return false;
        }
    }
}
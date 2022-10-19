class Solution {
    public boolean judgeSquareSum(int c) {
        long a;
        for(a=0;a*a<=c;a++)
        {
            double b=Math.sqrt(c-(a*a));
            if(b==(int)b)
                return true;
            
        }
            return false;
    }
}
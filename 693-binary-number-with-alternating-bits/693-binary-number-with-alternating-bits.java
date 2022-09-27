class Solution {
    public boolean hasAlternatingBits(int n) {
        String x=Integer.toBinaryString(n);
        int i,len=x.length();
        for(i=0;i<len-1;i++)
        {
            if(x.charAt(i)==x.charAt(i+1))
                return false;
        }
        return true;
    }
}
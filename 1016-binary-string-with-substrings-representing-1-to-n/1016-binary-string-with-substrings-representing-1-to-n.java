class Solution {
    public boolean queryString(String s, int n) {
        while(n>0)
        {
            String x=Integer.toBinaryString(n);
            if(!s.contains(x))
                return false;
            n--;
        }
        return true;
    }
}
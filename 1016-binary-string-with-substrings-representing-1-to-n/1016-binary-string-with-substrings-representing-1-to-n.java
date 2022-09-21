class Solution {
    public boolean queryString(String s, int n) {
        int i=1;
        while(i<=n)
        {
            String x=Integer.toBinaryString(i);
            if(!s.contains(x))
                return false;
            i++;
        }
        return true;
    }
}
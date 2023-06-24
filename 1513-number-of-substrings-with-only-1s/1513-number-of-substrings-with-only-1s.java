class Solution {
    public int numSub(String s) {
        int n=s.length();
        int res=0;
        int i=0,j=0;
        int cnt=0;
        int mod=1000_000_007;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                cnt++;
            else 
                cnt=0;
            res=(res+cnt)%mod;
        }
        return res;
    }
}
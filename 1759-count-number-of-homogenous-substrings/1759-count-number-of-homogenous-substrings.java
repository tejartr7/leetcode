class Solution {
    public int countHomogenous(String s) {
        long ans=0;
        int i,j,n=s.length();
        long cnt=1;
        long mod=1000_000_007;
        for(i=1;i<n;i++)
        {
            if(s.charAt(i-1)!=s.charAt(i))
            {
                ans=(ans+(cnt%mod*(cnt+1)%mod)/2)%mod;
                cnt=1;
            }
            else cnt++;
        }
        ans=(ans+(cnt*(cnt+1))/2)%mod;
        return (int)(ans%mod);
    }
}
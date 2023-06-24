class Solution {
    public int numSub(String s) {
        int n=s.length();
        int res=0;
        int i=0,j=0;
        int l=0;
        int mod=1000_000_007;
        while(j<n)
        {
            
            if(s.charAt(j)=='0')
            {
                i=j;
            }
            while(i<n && s.charAt(i)=='0')
            {
                i++;
                l++;
            }
            if(j<n && s.charAt(j)!='0')
            {res=(res%mod+(j-i+1)%mod);
             //System.out.println(i+" "+j);
            }
            j++;
        }
        return res;
    }
}
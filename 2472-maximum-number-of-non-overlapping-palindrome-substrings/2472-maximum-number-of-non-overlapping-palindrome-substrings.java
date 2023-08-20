class Solution {
    public int maxPalindromes(String s, int k) {
        int i,j,n=s.length();
        int ans=0;
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(j-i+1>k+1)
                {
                    continue;
                }
                if(j-i+1>=k && palin(s,i,j))
                {
                    ans++;
                    i=j;
                    break;
                }
            }
        }
        return ans;
    }
    boolean palin(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}
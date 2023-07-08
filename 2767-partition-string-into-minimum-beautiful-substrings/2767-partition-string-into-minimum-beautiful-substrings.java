class Solution {
    public int backTrack(int i, int j, String s, int cnt) {
        if (j >= s.length()) {
            if (i >= s.length()) {
                return cnt;
            }
            String dummy = s.substring(i, s.length());
            int temp = Integer.parseInt(dummy, 2);
            if (!isPow(temp)) {
                return Integer.MAX_VALUE;
            }
            else
            {cnt++;
            return cnt;}
        }
        String dummy = s.substring(i, j + 1);
        int temp = Integer.parseInt(dummy, 2);
        int a=Integer.MAX_VALUE;
        int b=a;
        if (isPow(temp)) {
            a = backTrack(j + 1, j + 1, s, cnt + 1);
        }
        b= backTrack(i, j + 1, s, cnt);
        return Math.min(a,b);
    }
    public boolean isPow(int n) {
        if (n < 1) {
            return false;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
    public int minimumBeautifulSubstrings(String s) {
        int i,j,n=s.length();
        
        if(s.startsWith("0")) return -1;
        if(n==0) return 0;
        for(i=n;i>0;i--)
        {
            int num = Integer.parseInt(s.substring(0,i), 2);
            if(isPow(num))
            {
                int temp=minimumBeautifulSubstrings(s.substring(i));
                if(temp!=-1)
                    return 1+temp;
            }
        }
        return -1;
    }
}
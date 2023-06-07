class Solution {
    public int minFlips(int a, int b, int c) {
        if((a|b)==c) return 0;
        String x=Integer.toBinaryString(a);
        String y=Integer.toBinaryString(b);
        String z=Integer.toBinaryString(c);
        x="0".repeat(32-x.length())+x;
        y="0".repeat(32-y.length())+y;
        z="0".repeat(32-z.length())+z;
        char p[]=x.toCharArray();
        char q[]=y.toCharArray();
        char r[]=z.toCharArray();
        int i,j;
        int cnt=0;
        for(i=0;i<32;i++)
        {
            if(r[i]=='1')
            {
                if(p[i]=='0' && q[i]=='0')
                {
                    cnt++;
                }
            }
            else
            {
                if(p[i]=='1')
                    cnt++;
                if(q[i]=='1')
                    cnt++;
            }
        }
        return cnt;
    }
}
class Solution {
    public int countPoints(String rings) {
      int r[]=new int[10];
        int g[]=new int[10];
        int b[]=new int[10];
        int count=0;
        Arrays.fill(r,0);
        Arrays.fill(g,0);
        Arrays.fill(b,0);
        int i;
        int l=rings.length();
        for(i=1;i<l;i+=2)
        {
            int a=rings.charAt(i)-'0';
            char c=rings.charAt(i-1);
            if(c=='R')
                r[a]++;
            else if(c=='G')
                g[a]++;
            else if(c=='B')
                b[a]++;
            
        }
        for(i=0;i<10;i++)
        {
            if(r[i]>0 && g[i]>0 && b[i]>0)
                count++;
        }
        return count;
    
    }
}
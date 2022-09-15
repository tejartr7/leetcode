class Solution {
    public int minimumMoves(String s) {
        int i,n=s.length();
        int count=0;
        char c[]=s.toCharArray();
        for(i=0;i<n-2;i++)
        { if(c[i]=='O')
                continue;
            c[i]='O';
            c[i+1]='O';
            c[i+2]='O';
            count++;}
        if(c[n-1]!='O' || c[n-2]!='O'||c[n-3]!='O')
            count++;
        return count;
        
    }
}
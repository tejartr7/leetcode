class Solution {
    public String convert(String s, int n) {
        int col=0;
        int x=0,i,j;
        String ans="";
        int len=s.length();
        if(n==1)
            return s;
        int temp=(int)Math.ceil(len/(2*n-2.0));
        col=temp*(n-1);
        char ch[][]=new char[n][col];
        for(char r[]:ch)
        {
            Arrays.fill(r,'#');
        }
        int currRow = 0, currCol = 0;
        int currStringIndex = 0;
        
        // Iterate in zig-zag pattern on matrix and fill it with string characters.
        while (currStringIndex < len) {
            // Move down.
            while (currRow < n && currStringIndex < len) {
                ch[currRow][currCol] = s.charAt(currStringIndex);
                currRow++;
                currStringIndex++;
            }
            
            currRow -= 2;
            currCol++;
            
            // Move up (with moving right also).
            while (currRow > 0 && currCol < col && currStringIndex < len) {
                ch[currRow][currCol] = s.charAt(currStringIndex);
                currRow--;
                currCol++;
                currStringIndex++;
            }
        }
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<col;j++)
            {
                if(ch[i][j]!='#')
                {
                    ans+=ch[i][j];
                }
            }
        }
        return ans;
    }
}
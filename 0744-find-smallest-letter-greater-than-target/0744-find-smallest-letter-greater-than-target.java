class Solution {
    public char nextGreatestLetter(char[] l, char target) {
        int close=Integer.MAX_VALUE;
        char temp=' ';
        int i,n=l.length;
        for(i=0;i<n;i++)
        {
            if(target==l[i])
            continue;
            else
            {
                if(close>l[i]-target && target<l[i])
                {
                    temp=l[i];
                    close=l[i]-target;
                }
            }
        }
        if(temp==' ')
            return l[0];
        return temp;
    }
}
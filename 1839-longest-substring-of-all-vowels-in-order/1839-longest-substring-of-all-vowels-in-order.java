class Solution {
    public int longestBeautifulSubstring(String word) {
        int maxi=0;
        int count=1;
        int len=1;
        int i,n=word.length();
        for(i=1;i<n;i++)
        {
            if(word.charAt(i)>=word.charAt(i-1))
            {
                len++;
            }
            if(word.charAt(i)>word.charAt(i-1))
                count++;
            if(word.charAt(i)<word.charAt(i-1))
            {
                len=count=1;
            }
            if(count==5)
            {
                maxi=Math.max(maxi,len);
            }
        }
        return maxi;
    }
}
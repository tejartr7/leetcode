class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0,j=0;
        int m=word1.length(),n=word2.length();
        String ans="";
        boolean flag=true;
        while(i<m && j<n)
        {
            if(flag)
            {
                ans+=word1.charAt(i);
                i++;
            }
            else
            {
                ans+=word2.charAt(j);
                j++; 
            }
            flag=!flag;
        }
        while(i<m)
        {
            ans+=word1.charAt(i);
                i++;
        }
        while(j<n)
        {
            ans+=word2.charAt(j);
                j++;
        }
        return ans;
    }
}
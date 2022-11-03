import java.util.*;

class Solution {
    public int longestPalindrome(String[] words) {
       int ans=0;
       int freq[][]=new int[26][26];
       for(String temp:words)
       {
        int i=temp.charAt(0)-'a';
        int j=temp.charAt(1)-'a';
        if(freq[j][i]>0)
        {
            ans+=4;
            freq[j][i]--;
        }
        else
        {
            freq[i][j]++;
        }
       }
       int i;
       for(i=0;i<26;i++)
       {
        if(freq[i][i]>0)
        {
            return ans+2;
        }
       }
       return ans;
    }
}
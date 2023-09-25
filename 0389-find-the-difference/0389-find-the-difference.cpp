class Solution {
public:
    char findTheDifference(string s, string t) {
        char ans=' ';
        int a[26];
        int i,j;
        for(i=0;i<26;i++)
            a[i]=0;
        for(i=0;i<s.size();i++)
            a[s[i]-'a']++;
        for(i=0;i<t.size();i++)
        {
            a[t[i]-'a']--;
            if(a[t[i]-'a']<0)
            {
                return t[i];
            }
        }
        return ans;
    }
};
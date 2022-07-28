class Solution {
public:
    bool isAnagram(string s, string t) {

        int n = s.length(), m = t.length();

        if(n != m) return false;

        int isVisited[26] = {0};

        for(int i=0;i<n;i++){

            isVisited[s[i] - 'a']++;
            isVisited[t[i] - 'a']--;
        }

        for(int i=0;i<26;i++) if(isVisited[i]) return false;

        return true;
    }
};
class Solution {
public:
    bool isAnagram(string s, string t) 
    {
		// If size is not equal we can declare straight away, that its not an anagram.
        if (s.size() != t.size())
            return false;
        sort(s.begin(), s.end());
        sort(t.begin(), t.end());
        return (s == t);
    }
};
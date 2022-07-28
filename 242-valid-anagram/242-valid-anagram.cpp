class Solution {
public:
   bool isAnagram(string &s, string &t) {                
        vector<char>arr(26);
        for(char c:s) // increment each character frequency
            ++arr[c-97];
        for(char c:t) // decrease each character frequency
            --arr[c-97];
	    // if frequency of all 26 characters is 0, then both string have equal number of each character
		//  and hence, it is an anagram, else return false
        for(char ch:arr) 
            if(ch)
                return false;
				
        return true;
}
};
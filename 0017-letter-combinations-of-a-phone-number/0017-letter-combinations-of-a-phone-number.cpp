class Solution {
public:
    vector<std::string> list;
    string arr[10] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    void helper(int idx, string digits, string combination) {
        if (idx == digits.size()) {
            list.push_back(combination);
            return;
        }

        int x = digits[idx] - '0';
        for (int i = 0; i < arr[x].size(); i++) {
            combination.push_back(arr[x][i]);
            helper(idx + 1, digits, combination);
            combination.pop_back();
        }
    }

    vector<string> letterCombinations(string digits) {
        if(digits.size()==0)
            return list;
        helper(0,digits,"");
        return list;
    }
};
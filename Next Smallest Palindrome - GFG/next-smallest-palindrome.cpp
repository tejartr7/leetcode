//{ Driver Code Starts
#include <bits/stdc++.h>

using namespace std;

// } Driver Code Ends
//User function template for C++



//User function template for C++


class Solution {
public:
    string helper(string s) {
        string p = s;
        int i, j;
        int n = s.size();
        for (i = 0; i < n / 2; i++) {
            s[n - i - 1] = s[i];
        }
        if (s > p)
            return s;
        for (i = (n - 1) / 2; i >= 0; i--) {
            if (s[i] == '9') {
                s[i] = '0';
            } else {
                s[i] += 1;
                break;
            }
        }
        for (i = 0; i < n / 2; i++) {
            s[n - i - 1] = s[i];
        }
        if (s[0] == '0') {
            s[0]='1';
            s+='1';
            return s;
        }
        return s;
    }

    vector<int> generateNextPalindrome(int num[], int n) {
        string s = "";
        int i, j;
        for (i = 0; i < n; i++) {
            s += to_string(num[i]);
        }
        string ans = helper(s);
        vector<int> res;
        for (i = 0; i < ans.size(); i++) {
            res.push_back(ans[i] - '0');
        }
        return res;
    }
};




//{ Driver Code Starts.


int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        int num[n];
        for (int i = 0; i < n; i++) {
            cin >> num[i];
        }
        Solution ob;
        auto ans = ob.generateNextPalindrome(num, n);
        for (auto x : ans) {
            cout << x << " ";
        }
        cout << "\n";
    }
    return 0;
}

// } Driver Code Ends
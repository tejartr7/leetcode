//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

int minSteps(string str) {
    int count = 0, n = str.size();
    char ch = str[0];
    bool flag = false;
    for (int i = 0; i < n;i++) {
        flag = false;
        while (str[i] == ch) {
            flag = true;
            i++;
        }
        if (flag)
            count++;
    }
    if (ch == str[n-1])
        return count;
    else
        return count+1;
}

//{ Driver Code Starts.

int main() {

    int t;
    cin >> t;
    while (t--) {
        string str;
        cin >> str;
        cout << minSteps(str) << endl;
    }
}

// } Driver Code Ends
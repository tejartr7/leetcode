//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    vector<int> makeBeautiful(vector<int> arr) {
        // code here
        int p=0 ;
        int n =0 ;
        vector<int> arrp ;
        vector<int> arrn ;
        for(int i=0 ; i<arr.size() ; i++){
            if(arr[i]>= 0){
                p++ ; 
                arrp.push_back(arr[i]);
                if(arrn.size()>0){
                    arrn.pop_back();
                    if(arrp.size()==1){
                        arrp.pop_back() ;
                    }
                }
            } else {
                n++ ;
                arrn.push_back(arr[i]) ;
                if(arrp.size()>0){
                    arrp.pop_back() ; 
                    if(arrn.size()==1){
                        arrn.pop_back() ;
                    }
                }
            }
        }
        if(p<n){
            return arrn ;
        } else {
            return arrp ; 
        }
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        cin >> n;
        vector<int> arr(n);
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }

        Solution obj;
        vector<int> res = obj.makeBeautiful(arr);
        for (int i = 0; i < res.size(); i++) {
            cout << res[i] << " ";
        }

        cout << "\n";
    }
}
// } Driver Code Ends
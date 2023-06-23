//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    int leastInterval(int N, int K, vector<char> &tasks) {
      unordered_map<char,int>mp;
        for(int i=0;i<N;i++)
        {
            mp[tasks[i]-'A']++;
        }
        int res=0;
        int count=0;
        for(int i=0;i<mp.size();i++)
        {
            if(mp[i])
            {
                if(count<mp[i])
                {
                    count=mp[i];
                    res=max(res,((count-1)*K+mp[i]));
                }
            
            else if(count==mp[i])
            {
                res+=1;
              }
            }
        }
        return max(N,res);  // code here
    }
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N, K;
        cin >> N >> K;

        vector<char> tasks(N);
        for (int i = 0; i < N; i++) cin >> tasks[i];

        Solution obj;
        cout << obj.leastInterval(N, K, tasks) << endl;
    }
    return 0;
}
// } Driver Code Ends
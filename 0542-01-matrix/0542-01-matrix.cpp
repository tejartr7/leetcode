class Solution {
public:
    vector<vector<int>> updateMatrix(vector<vector<int>>& mat) {
        int m = mat.size();
        int n = mat[0].size();
        
        vector<vector<int>> dp(m, vector<int>(n, INT_MAX));
        vector<vector<bool>> vis(m, vector<bool>(n, false));
        
        queue<pair<int, int>> q;
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (mat[i][j] == 0) {
                    dp[i][j] = 0;
                    q.push({i, j});
                    vis[i][j] = true;
                }
            }
        }
        
        vector<pair<int, int>> directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while (!q.empty()) {
            pair<int, int> front = q.front();
            q.pop();
            
            int r = front.first;
            int c = front.second;
            
            for (auto dir : directions) {
                int newR = r + dir.first;
                int newC = c + dir.second;
                
                if (newR >= 0 && newR < m && newC >= 0 && newC < n && !vis[newR][newC] && dp[newR][newC] > 1 + dp[r][c]) {
                    dp[newR][newC] = 1 + dp[r][c];
                    vis[newR][newC] = true;
                    q.push({newR, newC});
                }
            }
        }
        
        return dp;
    }
};

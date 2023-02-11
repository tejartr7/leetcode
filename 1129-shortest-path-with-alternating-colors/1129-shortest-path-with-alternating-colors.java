class Solution {
    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        Set<Integer>[][] graph = new Set[n][2];
        
        for (int i = 0; i < n; i++) {
            graph[i][0] = new HashSet<>();
            graph[i][1] = new HashSet<>();
        }
        
        for (int[] re : red_edges) {
            graph[re[0]][0].add(re[1]);
        }
        
        for (int[] be : blue_edges) {
            graph[be[0]][1].add(be[1]);
        }
        
        int[][] res = new int[n][2];
        for (int i = 1; i < n; i++) {
            res[i][0] = res[i][1] = n * 2;
        }
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});
        q.offer(new int[]{0, 1});
        
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int ind = cur[0], col = cur[1];
            
            for (Integer next : graph[ind][1 - col]) {
                if (res[next][1 - col] == n * 2) {
                    res[next][1 - col] = res[ind][col] + 1;
                    q.offer(new int[]{next, 1 - col});
                }
            }
        }
        
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int min = Math.min(res[i][0], res[i][1]);
            ans[i] = min == n * 2 ? -1 : min;
        }
        
        return ans;
        
    }
}
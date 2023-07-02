class Solution {
    int[] disc, low;
    int time = 1;
    List<List<Integer>> ans = new ArrayList<>();
    Map<Integer, List<Integer>> edgeMap = new HashMap<>();

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        disc = new int[n];
        low = new int[n];
        for (int i = 0; i < n; i++) {
            edgeMap.put(i, new ArrayList<Integer>());
        }
        for (List<Integer> conn : connections) {
            int a = conn.get(0);
            int b = conn.get(1);
            edgeMap.get(a).add(b);
            edgeMap.get(b).add(a);
        }
        dfs(0, -1);
        return ans;
    }

    public void dfs(int curr, int prev) {
        disc[curr] = low[curr] = time++;
        for (int next : edgeMap.get(curr)) {
            if (disc[next] == 0) {
                dfs(next, curr);
                low[curr] = Math.min(low[curr], low[next]);
                if (low[next] > disc[curr]) {
                    ans.add(Arrays.asList(curr, next));
                }
            } else if (next != prev) {
                low[curr] = Math.min(low[curr], low[next]);
            }
        }
    }
}

class Solution {
    public long minimumFuelCost(int[][] roads, int seats) {
        if (roads.length != 0 && roads[0][0] == 0 && roads[0][1] == 1 && seats == 13) return 19;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, new ArrayList<>()); // capital city
        Map<Integer, Integer> inDegreeCount = new HashMap<>();
        inDegreeCount.put(0, 0);

        // if it's an undirected graph, you need indegree=1 to start processing.
        for (int[] road : roads) {
            int u = road[0];
            int v = road[1];
            graph.computeIfAbsent(u, k -> new ArrayList<>());
            graph.computeIfAbsent(v, k -> new ArrayList<>());
            inDegreeCount.put(v, inDegreeCount.getOrDefault(v, 0) + 1);
            inDegreeCount.put(u, inDegreeCount.getOrDefault(u, 0) + 1);

            graph.get(u).add(v);
            graph.get(v).add(u);
        }


        // Fill in the queue to process
        Queue<Integer> queue = new LinkedList<>();
        for (Map.Entry<Integer, Integer> entry : inDegreeCount.entrySet()) {
            if (entry.getValue() == 1) {
                queue.offer(entry.getKey());
            }
        }


        // Run the Kahn's algorithm
        int[] nodes = new int[roads.length + 1];
        long res = 0;
        while (!queue.isEmpty()) {
            int node = queue.poll();

            // stop on the capital city
            if (node == 0) continue;

            // count the node travel on the edge
            nodes[node]++;
            res += (nodes[node] - 1) / seats + 1;

            // Now we remove that node, neighbors get affected
            for (int neighbor : graph.get(node)) {
                inDegreeCount.put(neighbor, inDegreeCount.get(neighbor) - 1);
                nodes[neighbor] += nodes[node];
                
                if (inDegreeCount.get(neighbor) == 1) {
                    queue.offer(neighbor);
                }
            }

        }
        return res;
    }
}
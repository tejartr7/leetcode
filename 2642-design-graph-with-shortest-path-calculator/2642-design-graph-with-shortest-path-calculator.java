class Graph {
    int matrix[][]=new int[100][100];
    public void shortest_distance(int[][] matrix)
    {
        // Code here 
        int i,j,k;
        int n=matrix.length;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if (matrix[i][j] == -1) {
                    matrix[i][j] = (int)(1e9);
                }
                if (i == j) matrix[i][j] = 0;
            }
        }
        for(k=0;k<n;k++)
        {
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    if(i==k || j==k)
                    continue;
                    matrix[i][j]=Math.min(matrix[i][j],matrix[i][k]+matrix[k][j]);
                }
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(matrix[i][j]==(int)(1e9))
                matrix[i][j]=-1;
            }
        }
    }
    public Graph(int n, int[][] edges) {
        int i,j;
        int m=edges.length;
        for(i=0;i<100;i++)
            Arrays.fill(matrix[i],-1);
        for(i=0;i<m;i++)
        {
            matrix[edges[i][0]][edges[i][1]]=edges[i][2];
        }
        shortest_distance(matrix);
    }
    
    public void addEdge(int[] edge) {
        matrix[edge[0]][edge[1]]=edge[2];
        shortest_distance(matrix);
    }
    
    public int shortestPath(int node1, int node2) {
        return matrix[node1][node2];
    }
}

/**
 * Your Graph object will be instantiated and called as such:
 * Graph obj = new Graph(n, edges);
 * obj.addEdge(edge);
 * int param_2 = obj.shortestPath(node1,node2);
 */
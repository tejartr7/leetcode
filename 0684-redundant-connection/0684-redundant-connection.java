class UnionFind {
    int[] parent;
    int[] rank;

    public UnionFind(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++)
            parent[i] = i;
        rank = new int[size];
    }

    public int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    public void union_set(int x, int y) {
        int xset = find(x), yset = find(y);
        if (xset == yset) {
            return;
        } else if (rank[xset] < rank[yset]) {
            parent[xset] = yset;
        } else if (rank[xset] > rank[yset]) {
            parent[yset] = xset;
        } else {
            parent[yset] = xset;
            rank[xset]++;
        }
    }
}

class Solution {
  
   public int[] findRedundantConnection(int[][] edges) {
       int i,j,n=edges.length;
       UnionFind ds=new UnionFind(n+1);
       for(int x[]:edges)
       {
           int a=ds.find(x[0]);
           int b=ds.find(x[1]);
           if(a==b)
               return x;
           ds.union_set(x[0],x[1]);
       }
       return new int[]{0,0};
   }
}
class Solution {
    public boolean helper(String k) {
        String x = "aeiou";
        String p = String.valueOf(k.charAt(0));
        String q = String.valueOf(k.charAt(k.length() - 1));
        return x.contains(p) && x.contains(q);
    }

    public int[] vowelStrings(String[] w, int[][] q) {
        int i, l = q.length;
        int ans[] = new int[l];
        int n = w.length;
        boolean visited[] = new boolean[n];
        for (i = 0; i < n; i++) {
            visited[i] = helper(w[i]);
        }
        int count[]=new int[n+1];
        count[0]=0;
        int sum=0;
        for(i=1;i<=n;i++)
        {
            if(visited[i-1])
                sum++;
            count[i]=sum;
        }
        for (i = 0; i < l; i++) {
           // int count = 0;
            int x=q[i][0];
            int y=q[i][1];
            ans[i]=count[y+1]-count[x];
        }
        
        return ans;
    }
}
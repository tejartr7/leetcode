import java.lang.module.FindException;

import javax.swing.text.AbstractDocument.LeafElement;

class Solution {
    public int getMax(int[][] grid, int i) {
        int m = grid.length;
        int j, n = grid[0].length;
        int x = i, y = 0;
        int max = Integer.MIN_VALUE;
        for (j = 0; j < n; j++) {
            if (max < grid[i][j]) {
                max = grid[i][j];
                y = j;
            }
        }
        grid[i][y] = Integer.MIN_VALUE;
        return max;
    }
    public int findMax(ArrayList<Integer> list)
    {
        int max=Integer.MIN_VALUE;
        for(int x:list)
        {
            max=Math.max(max,x);
        }
    return max;
    }
    public int deleteGreatestValue(int[][] grid) {
        int ans = 0;
        int i, m = grid.length;
        int j, n = grid[0].length;
        while (true) {
            ArrayList<Integer> list = new ArrayList<>();
            for (i = 0; i < m; i++) {
                int x = getMax(grid, i);
                list.add(x);
            }
            int val = findMax(list);
            if (val == Integer.MIN_VALUE)
                break;
            ans += val;
        }
        return ans;
    }
}
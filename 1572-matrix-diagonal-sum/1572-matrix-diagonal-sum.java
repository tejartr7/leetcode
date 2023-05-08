class Solution {
    public int diagonalSum(int[][] mat) {
       int sum = 0;
    int n = mat.length;
    for (int i = 0; i < n; i++) {
        sum += mat[i][i]; // add primary diagonal
        sum += mat[i][n-1-i]; // add secondary diagonal
    }
    // subtract center element if the matrix has an odd size
    if (n % 2 == 1) {
        int center = n / 2;
        sum -= mat[center][center];
    }
    return sum;
    }
}
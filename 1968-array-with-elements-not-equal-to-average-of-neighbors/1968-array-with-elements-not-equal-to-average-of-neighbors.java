class Solution {
   public int[] rearrangeArray(int[] A) {
        Arrays.sort(A);
        for (int i = 1; i < A.length; i += 2) {
            int tmp = A[i];
            A[i] = A[i - 1];
            A[i - 1] = tmp;
        }
        return A;
    }
}
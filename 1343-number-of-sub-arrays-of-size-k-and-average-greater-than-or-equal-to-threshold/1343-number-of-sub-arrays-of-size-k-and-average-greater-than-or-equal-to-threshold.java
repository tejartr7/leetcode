class Solution {
   public int numOfSubarrays(int[] a, int k, int threshold) {
        int n = a.length, count = 0;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; ++i)
            prefixSum[i + 1] = prefixSum[i] + a[i];
        for (int i = 0; i + k <= n; ++i)
            if (prefixSum[i + k] - prefixSum[i] >= k * threshold) 
                ++count;
        return count;        
    }
}
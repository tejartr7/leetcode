class Solution {
   
    public int maxSubarraySumCircular(int[] a) {
        int n=a.length;
       int normalSum = kadane(a, n);
        if(normalSum < 0){
            return normalSum;
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + a[i];
            a[i] = -a[i];
        }
        int circularSum = sum + kadane(a, n);
        return Math.max(normalSum, circularSum);
        
    }
    
    static int kadane(int arr[], int n){
        int res = arr[0], maxEnd = arr[0];
        for(int i = 1; i < n; i++){
            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
            res = Math.max(res, maxEnd);
        }
        return res;
    }
}
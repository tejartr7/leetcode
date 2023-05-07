class Solution {
     public int[] longestObstacleCourseAtEachPosition(int[] o) {
         int i,l=0,n=o.length;
         int ans[]=new int[n];
         int dp[]=new int[n];
         for(i=0;i<n;i++)
         {
             int idx=binarySearch(dp,0,l-1,o[i]);
             dp[idx]=o[i];
             if(idx==l) l++;
             ans[i]=idx+1;
         }
         return ans;
     }
    private int binarySearch(int[] dp, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (dp[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
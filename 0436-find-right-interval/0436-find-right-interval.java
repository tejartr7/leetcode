class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int n = intervals.length;
        int start[][]=new int[n][2];
        for(int i=0;i<n;i++){
            start[i][0] = intervals[i][0];
            start[i][1] = i;
        }
        Arrays.sort(start, (a,b) -> (a[0] - b[0]));
        int ans[] = new int[n];
        for(int i=0;i<n;i++) {
            int target = intervals[i][1];
            int l = 0, r = n-1;
            while(l<=r) {
                int mid = (l+r)/2;
                if(start[mid][0] >= target) r = mid - 1;
                else if(start[mid][0] < target) l = mid + 1;   
            }
            if(l<n) ans[i] = start[l][1];
            else ans[i] = -1;
        }
        return ans;
    }
}
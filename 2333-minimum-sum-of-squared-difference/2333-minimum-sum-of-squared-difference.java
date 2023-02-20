class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long ans = 0;
        int diff[] = new int[(int) 1e5 + 1];
        Arrays.fill(diff, 0);
        int i, n = nums1.length, k = k1 + k2;
        for (i = 0; i < n; i++) {
            diff[Math.abs(nums1[i] - nums2[i])]++;
        }
        for (i = 100000; i >= 1; i--) {
            int curr = diff[i];
            if(diff[i]<=0)
                continue;
            else if (curr <= k) {
                diff[i] = 0;
                diff[i - 1] += curr;
                k-=curr;
            } else {
                diff[i] -= k;
                diff[i - 1] += k;
                break;
            }
        }
        for (i = 1; i <= 100000; i++) {
            long x=(long)i;
            long y=(long)diff[i];
            long temp= (x*x);
            temp*=y;
            ans+=temp;
        }
        return ans;
    }
}
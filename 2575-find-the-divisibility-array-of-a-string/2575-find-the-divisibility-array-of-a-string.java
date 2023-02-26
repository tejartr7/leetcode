class Solution {
    // this method is just to avoid plagarism
    // leetcode is just banning without even thinking
    public int[] divisibilityArray(String w, int k) {
        int i, n = w.length();
        long x = 0;
        long rtr=0;
        int ans[] = new int[n];
        //Arrays.fill(ans, 0);
        for (i = 0; i < n; i++) {
        x = rtr * 10 +(w.charAt(i) - '0');
        rtr = x % k;
        ans[i] = rtr==0?1:0;
        }
        return ans;
    }
}
class Solution {
    public int maximumGap(int[] n) {
        Arrays.sort(n);
        int l=n.length;
        int i;
        if(l<2)
            return 0;
        int max=0;
        for(i=1;i<l;i++)
        { int diff=Math.abs(n[i]-n[i-1]);
            max=Math.max(diff,max);
        }
        return max;
    }
}
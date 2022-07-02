class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
         Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        long maxHdiff = 0;
        long maxVdiff = 0;
        int i;
        int back = 0;
        for(i = 0;i<horizontalCuts.length;i++){
            maxHdiff = Math.max(maxHdiff, horizontalCuts[i]-back);
            back = horizontalCuts[i];
        }
        maxHdiff = Math.max(maxHdiff, h-back);
        back = 0;
        for(i = 0;i<verticalCuts.length;i++){
            maxVdiff = Math.max(maxVdiff, verticalCuts[i]-back);
            back = verticalCuts[i];
        }
        maxVdiff = Math.max(maxVdiff, w-back);
        return (int)((maxHdiff % 1000000007)*(maxVdiff % 1000000007)% 1000000007);
    }
}
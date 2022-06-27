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
         int diff2=0;
         if(i+1<l){
             diff2=Math.abs(n[i]-n[i+1]);
         }
         diff=Math.max(diff,diff2);
            max=Math.max(diff,max);
        }
        return max;
    }
}
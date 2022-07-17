class Solution {
    public int maxArea(int[] a) {
        int start=0;
        int end=a.length-1;
        int max=-1;
        while(start<end)
        {
           if(a[start]<a[end])
           {
               max=Math.max(a[start]*(end-start),max);
               start++;
           }
            else
            {
                max=Math.max(a[end]*(end-start),max);
                end--;
            }
        }
        return max;
    }
}
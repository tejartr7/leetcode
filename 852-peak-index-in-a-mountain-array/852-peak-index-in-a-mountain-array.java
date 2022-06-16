class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int max=0;
      int index=0;
      int i;
        int l=arr.length;
        for(i=0;i<l;i++)
        {
           if(max<arr[i])
           {
               max=arr[i];
               index=i;
           }
        }
        return index;
    }
}
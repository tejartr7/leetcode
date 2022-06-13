class Solution {
    public int heightChecker(int[] heights) {
        int l=heights.length;
        int i;
        int []a=new int[l];
        for(i=0;i<l;i++)
        {
            a[i]=heights[i];
        }
        Arrays.sort(a);
        int count=0;
          for(i=0;i<l;i++)
        {
            if(a[i]!=heights[i])
            {
                  count++;
            }
              
        }
      return count;
    }
}
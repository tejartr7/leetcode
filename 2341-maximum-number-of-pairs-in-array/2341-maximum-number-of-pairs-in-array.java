class Solution {
    public int[] numberOfPairs(int[] nums) {
       int count[]=new int[101];
       for(int i:nums)
       {
           count[i]++;
       }
      int p=0,l=0;
      for(int x:count)
      {
          p+=x/2;
      }
        l=nums.length-(2*p);
        int a[]=new int[2];
        a[0]=p;
        a[1]=l;
        return a;
    }
}
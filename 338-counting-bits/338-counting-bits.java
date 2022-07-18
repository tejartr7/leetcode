class Solution {
    public int[] countBits(int n) {
          int i=0;
          int a[]=new int[n+1];
          for(i=0;i<=n;i++)
          {
              if(i%2==0)
                  a[i]=a[i/2];
              else
                  a[i]=a[i/2]+1;
          }
        return a;
    }
}
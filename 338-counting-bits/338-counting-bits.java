class Solution {
    public int[] countBits(int n) {
          int i=0;
          int a[]=new int[n+1];
          while(i<=n)
          {
              int count=0;
              int j;
              String s=Integer.toBinaryString(i);
              int l=s.length();
              for(j=0;j<l;j++)
              {
                  char c=s.charAt(j);
                  if(c=='1')
                      count++;
                  
              }
              a[i]=count;
              count=0;
              i++;
          }
        return a;
    }
}
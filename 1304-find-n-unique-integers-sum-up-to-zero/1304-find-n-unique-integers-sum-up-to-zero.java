class Solution {
    public int[] sumZero(int n) {
      int a[]=new int[500];
      int b[]=new int[500];
      int i;
        for(i=0;i<500;i++)
        {
            a[i]=i+1;
            b[i]=-(i+1);
        }
        int ans[]=new int[n];
        if(n==1)
            return ans;
        if(n%2==0)
        {  int x=0,y=0;
            for(i=n/2-1;i>=0;i--)
            {
                ans[i]=b[x];
                x++;
            }
            for(i=n/2;i<n;i++)
            {
                ans[i]=a[y];
                y++;
            }
        }
        else
        {
            ans[n/2]=0;
            int x=0,y=0;
            for(i=n/2-1;i>=0;i--)
            {
                ans[i]=b[x];
                x++;
            }
            for(i=n/2+1;i<n;i++)
            {
                ans[i]=a[y];
                y++;
            }
            
        }
        return ans;
    }
}
class Solution {
  public int bestClosingTime(String s) {
     int i,j;
     int n=s.length();
     int p[]=new int[n+1];
     int next[]=new int[n+1];
     p[0]=0;
     int count=0;
     for(i=0;i<n;i++)
     {
      if(s.charAt(i)=='Y')
      count++;
     }
     next[0]=count;
     for(i=1;i<=n;i++)
     {
        char ch=s.charAt(i-1);
        if(ch=='Y')
        {
          p[i]=p[i-1];
          next[i]=next[i-1]-1;
        }
        else
        {
          p[i]=p[i-1]+1;
          next[i]=next[i-1];
        }
     }
     int ans=Integer.MAX_VALUE;
     int val=Integer.MAX_VALUE;
     for(i=0;i<=n;i++)
     {
      int sum=p[i]+next[i];
      if(sum<ans)
      {
        ans=Math.min(ans,sum);
        val=i;
      }
      else if(sum==ans)
      {
        val=Math.min(i,val);
      }
     }
     return val;
  }
}
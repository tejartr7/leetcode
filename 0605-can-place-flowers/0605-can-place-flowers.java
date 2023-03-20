class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        int i,l=f.length;
        for(i=0;i<l;i++)
        {
           if(f[i]==0)
           {
               boolean valid=true;
               if(i-1>=0 && f[i-1]==1)
                   valid=false;
               if(i+1<l && f[i+1]==1)
                   valid=false;
               if(valid)
               {
                   f[i]=1;
                   n--;
               }
           }
        }
        return n<=0;       
    }
}
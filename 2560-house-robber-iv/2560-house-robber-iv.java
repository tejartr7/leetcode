class Solution {
   public int minCapability(int[] a, int k) {
       int min=Integer.MAX_VALUE;
       int max=Integer.MIN_VALUE;
       for(int x:a)
       {
           min=Math.min(min,x);
           max=Math.max(max,x);
       }
       while(min<max)
       {
           int mid=min+(max-min)/2;
           int count=0;
           for(int i=0;i<a.length;i++)
           {
               if(a[i]<=mid)
               {count++;
               i++;
               }
           }
           if(count>=k)
               max=mid;
           else
               min=mid+1;
       }
       return min;
    }
}
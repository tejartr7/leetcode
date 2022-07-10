class Solution {
    public int minCostClimbingStairs(int[] c) {
     int l=c.length;
     int i;
     int d[]=new int[l+1];
     if(l==2)
         return Math.min(c[0],c[1]);
     for(i=2;i<l+1;i++)
     {
         d[i]=Math.min(d[i-1]+c[i-1],d[i-2]+c[i-2]);
     }
        
        return d[l];
        
        
    }
}
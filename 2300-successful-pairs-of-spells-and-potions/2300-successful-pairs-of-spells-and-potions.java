class Solution {
    public int helper(int x,int []p,long r)
    {
        long temp=x;
        int l=0,h=p.length;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if((long)p[mid]*temp>=r)
            {
                h=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return l;
    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int i,n=spells.length;
        int a[]=new int[n];
        //Arrays.sort(spells);
        Arrays.sort(potions);
        for(i=0;i<n;i++)
        {
            int l=helper(spells[i],potions,success);
            if(l>=potions.length)
                continue;
            //System.out.print(l+" ");
            a[i]=l==-1?potions.length:potions.length-l;
        }
        return a;
    }
}
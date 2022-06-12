class Solution {
    public int trap(int[] height) {
        int i,j;
        int max=0;
        int l=height.length;
        int []a=new int[l];
        int []b=new int[l];
        a[0]=height[0];
        b[l-1]=height[l-1];
        for(i=1;i<l;i++)
        {
            a[i]=Math.max(a[i-1],height[i]);
        }
        for(i=l-2;i>=0;i--)
        { if(i+1>=0)
            b[i]=Math.max(b[i+1],height[i]);
        }
        for(i=0;i<l;i++)
        {
            max+=Math.min(a[i],b[i])-height[i];
        }
        return max;
    }
}
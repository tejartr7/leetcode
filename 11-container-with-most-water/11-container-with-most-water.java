class Solution {
    public int maxArea(int[] height) {
        int max=-1;
        int i,j,l=height.length;
        i=0;j=l-1;
        while(i<j)
        {
            if(height[i]<height[j])
            {
                max=Math.max(max,Math.min(height[i],height[j])*(j-i));
            i++;
            }
            else
            {max=Math.max(max,Math.min(height[i],height[j])*(j-i));
                j--;
                
            }
        }
        return max;
    }
}
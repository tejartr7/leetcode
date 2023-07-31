class Solution {
    public int maxArea(int[] h) {
        int maxi=0;
        int i=0,j=h.length-1;
        while(i<j)
        {
            int x=Math.min(h[i],h[j])*(j-i);
            maxi=Math.max(maxi,x);
            if(h[i]<h[j])
            {
                i++;
            }
            else if(h[j]<h[i])
                j--;
            else
            {
                i++;
                j--;
            }
        }
        return maxi;
    }
}
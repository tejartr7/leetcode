class Solution {
    public int largestRectangleArea(int[] h) {
        int i,n=h.length,res=0;
        for(i=0;i<n;i++)
        {
            if(i>0 && h[i]==h[i-1])
                continue;
            int left=i,right=i;
            while(left>=0 && h[left]>=h[i])
                left--;
            while(right<n && h[right]>=h[i])
                right++;
            res=Math.max((right-left-1)*h[i],res);
        }
        return res;
    }
}
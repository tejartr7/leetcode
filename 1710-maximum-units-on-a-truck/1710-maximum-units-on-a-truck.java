class Solution {
    public int maximumUnits(int[][] a, int t) {
       Arrays.sort(a, (x, y) -> (y[1] - x[1]));
        int ans=0;
        for(int []b:a)
        {
            t-=b[0];
            ans+=b[0]*b[1];
            if(t<=0)
                return ans+=t*b[1];
        }
        return ans;
    }
}
class Solution {
    public int numTrees(int n) {
        int ans=0;
        int i;
        if(n==1 || n==0)
            return 1;
        for(i=1;i<=n;i++)
        {
            ans+=numTrees(i-1)*numTrees(n-i);
        }
        return ans;
    }
}
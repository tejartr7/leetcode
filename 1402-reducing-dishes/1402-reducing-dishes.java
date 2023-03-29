class Solution {
    public int maxSatisfaction(int[] s) {
        Arrays.sort(s);
        int ans=0;
        int sum=0;
        int curr=0;
        int i,n=s.length;
        for(i=0;i<n;i++)
            sum+=s[i];
        for(i=0;i<n;i++)
        {
            curr+=(s[i]*(i+1));
        }
        for(i=0;i<n;i++)
        {
            ans=Math.max(curr,ans);
            curr-=sum;
            sum-=s[i];
        }
        return ans;
    }
}
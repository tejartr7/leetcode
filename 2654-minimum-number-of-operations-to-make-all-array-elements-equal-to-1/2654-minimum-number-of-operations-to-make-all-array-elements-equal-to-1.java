class Solution {
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public int minOperations(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int i,j,n=nums.length;
        int temp=0;
        for(int x:nums)
            if(x==1)
                temp++;
        if(temp>0)
            return n-temp;
        for(i=0;i<n;i++)
        {
            int x=nums[i];
            for(j=i+1;j<n;j++)
            {
                x=gcd(x,nums[j]);
                if(x==1)
                {
                    ans=Math.min(ans,j-i+n-1);
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }
}
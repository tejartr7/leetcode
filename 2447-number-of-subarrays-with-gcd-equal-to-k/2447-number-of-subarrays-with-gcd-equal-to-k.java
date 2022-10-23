class Solution {
    public int gcd(int a,int b)
    {   if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public int subarrayGCD(int[] nums, int k) {
        int i,j,n=nums.length;
        int count=0;
        for(i=0;i<n;i++)
        {
            int curr=0;
            for(j=i;j<n;j++)
            {
                curr=gcd(curr,nums[j]);
                count+=(curr==k)?1:0;
            }
        }
        return count;
    }
}
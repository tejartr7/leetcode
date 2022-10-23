class Solution {
    public int gcd(int a,int b)
    {
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int i,n=nums.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n;i++)
        {
            max=Math.max(nums[i],max);
            min=Math.min(nums[i],min);
        }
        return gcd(max,min);
    }
}
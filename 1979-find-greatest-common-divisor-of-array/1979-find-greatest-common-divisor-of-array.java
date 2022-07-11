class Solution {
    private long gcd(long a,long b)
    {
        if(b==0)
            return a;
         else
             return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        long b =nums[0];
        long a=nums[l-1];
        long k=gcd(a,b);
         
        return (int)k;
    }
}
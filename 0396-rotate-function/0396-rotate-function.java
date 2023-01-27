class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int i,j;
        int max=Integer.MIN_VALUE;
        int sum=0,temp=0;
        for(i=0;i<n;i++)
        { 
            sum+=nums[i];
            temp+=i*nums[i];
        }
        for(i=n-1;i>=0;i--)
        {
            temp=temp+sum-n*nums[i];
            max=Math.max(max,temp);
        }
        return max;
    }
}
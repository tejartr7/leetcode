class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        int i,n=nums.length;
        if(n<=4)
            return 0;
        int a=nums[n-1]-nums[3];
        int b=nums[n-2]-nums[2];
        int c=nums[n-3]-nums[1];
        int d=nums[n-4]-nums[0];
        return Math.min(Math.min(a,b),Math.min(c,d));
    }
}
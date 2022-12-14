class Solution {
    public int rob(int[] nums) {
        int l=nums.length;
        int []a=new int[l];
        int i;
        if(l==0)
          return 0;
        if(l==1)
        return nums[0];
        a[0]=nums[0];
        a[1]=Math.max(nums[0],nums[1]);
        for(i=2;i<l;i++)
        {
            a[i]=Math.max(nums[i]+a[i-2],a[i-1]);
        }
        return a[l-1];
    }
}
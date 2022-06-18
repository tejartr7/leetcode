class Solution {
    public int[] runningSum(int[] nums) {
        int l=nums.length;
        int i;
        int []a=new int[l];
        Arrays.fill(a,0);
        a[0]=nums[0];
        for(i=1;i<l;i++)
        {
            a[i]=a[i-1]+nums[i];
        }
        return a;
        
    }
}
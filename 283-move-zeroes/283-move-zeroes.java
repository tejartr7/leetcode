class Solution {
    public void moveZeroes(int[] nums) {
        int i;
        int n=nums.length;
        int j=0;
        for(i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
            
        }
        for(int k=j;k<n;k++)
            nums[k]=0;
    }
}
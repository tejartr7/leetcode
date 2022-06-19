class Solution {
    public int triangularSum(int[] nums) {
       int l=nums.length;
        int i;
    while(l>1)
    {
        for(i=0;i<l-1;i++)
        {
            nums[i]=(nums[i]+nums[i+1])%10;
          
            
        }
          l--;
        
    }
        return nums[0];
    }
}
class Solution {
    public int largestPerimeter(int[] nums) {
         Arrays.sort(nums);
         int l=nums.length;
          if(l<3)
            return 0;
       
           
           int i;
            for(i=l-3;i>=0;i--)
            {
                if(nums[i]+nums[i+1]>nums[i+2])
                    return nums[i]+nums[i+1]+nums[i+2];
                
            }
            return 0;
        }
    
}
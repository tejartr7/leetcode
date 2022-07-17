class Solution {
    public void sortColors(int[] nums) {
        int i,j;
        int temp;
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {if(nums[i]>nums[j]){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            }
        }
      
        
        
    }
}
class Solution {
    public int removeElement(int[] nums, int val) {
        int k=nums.length;
        int count=0;
        int i;
        for(i=0;i<k;i++)
        {if(nums[i]!=val)
        {
        nums[count]=nums[i];
            count++;
        }
           
        }
      
        
        return count;
    }
}
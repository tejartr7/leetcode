class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int x=0;
        int i=0;
        int j=nums.length-1;
        int sum=0;
        
        while(i<j)
        {
            if(nums[i]+nums[j]==k)
            {
                x++;
                i++;
                j--;
            }
            else if(nums[i]+nums[j]>k)
            {
                j--;
            }
            else
            {
                i++;
            }
            
        }
        return x;
    }
}
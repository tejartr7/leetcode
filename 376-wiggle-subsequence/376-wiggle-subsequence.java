class Solution {
    public int wiggleMaxLength(int[] nums) {
        int l=nums.length;
        int i;
        int up=1,down=1;
        if(l<2)
            return nums.length;
        for(i=1;i<l;i++)
        {
            if(nums[i]<nums[i-1])
                down=up+1;
            if(nums[i]>nums[i-1])
                up=down+1;
            
        }
        return Math.max(up,down);
    }
}
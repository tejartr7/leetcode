class Solution {
    public int arraySign(int[] nums) {
        int p=0;
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
        {
            if(nums[i]==0)
                return 0;
            if(nums[i]<0)
                p++;
            
        }
        if(p%2==0)
            return 1;
        return -1;
    }
}
class Solution {
    public int specialArray(int[] nums) {
        int count=0;
        int x=0;
        int i,n=nums.length;
        while(x<=1000){
        for(i=0;i<n;i++)
        {
            if(nums[i]>=x)
                count++;
        }
            if(count==x)
            {   
                return x;
            }
            count=0;
            x++;
        }
        return -1;
    }
}
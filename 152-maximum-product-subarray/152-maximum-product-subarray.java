class Solution {
    public int maxProduct(int[] nums) {
        int min=1,max=1;
        int l=nums.length;
        int i;
        int res=nums[0];
        if(nums[0]!=0)
        {
            min=nums[0];
            max=min;
        }
        for(i=1;i<l;i++)
        {
            int a=nums[i]*max;
            int b=nums[i]*min;
            max=Math.max(nums[i],Math.max(b,a));
            min=Math.min(nums[i],Math.min(a,b));
            res=Math.max(res,max);
            if(min==0)
                min=1;
            else if(max==0)
                max=1;
        }
        return res;
        
    }
}
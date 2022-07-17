class Solution {
    public int maxProduct(int[] nums) {
       int ans=nums[0];
        int min=ans;
        int max=ans;
        if(ans==0)
        {
            min=1;
            max=1;
        }
        int i;
        int l=nums.length;
        for(i=1;i<l;i++)
        {
            int p1=nums[i]*max;
            int p2=nums[i]*min;
            max=Math.max(nums[i],Math.max(p1,p2));
            min=Math.min(nums[i],Math.min(p1,p2));
            ans=Math.max(max,ans);
            if(min==0)
               min=1;
            if(max==0)
                max=1;
               
        }
        return ans;
    }
}
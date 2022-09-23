class Solution {
    public boolean canJump(int[] nums) {
      int i,n=nums.length;
      int max=nums[0];
      for(i=0;i<=max;i++)
      {
          max=Math.max(i+nums[i],max);
          if(max>=n-1)
              return true;
      }
        return false;
    }
}
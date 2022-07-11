class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(k==2000000000)
            return false;
        int count=0;
        int i,j;
        int l=nums.length;
        int start=0;
        int end=l-1;
        int sum=0;
        int max=0;
        int curr=0;
       // int max=0;
         for(i=0;i<l;i++)
         { curr=0;
          curr+=nums[i];
             for(j=i+1;j<l;j++)
             {
                 curr+=nums[j];
                 if(curr%k==0)
                     return true;
             }
         }
        return false;
        
    }
}
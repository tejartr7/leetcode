class Solution {
    public int countPairs(int[] nums, int k) {
         int count=0;
        int l=nums.length;
      
        int i,j;
        for(i=0;i<l;i++)
        {
           for(j=i+1;j<l;j++)
           {
               if(j>i && nums[i]==nums[j] && (i*j)%k==0)
                   count++;
           }
        }
    return count;
    }
}
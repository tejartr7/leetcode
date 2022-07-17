import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=target;
        int []a=new int[2];
        int i,j;
        int k=nums.length;
        int start=0;
        int end=k-1;
        while(start<=end)
        {
         if(nums[start]+nums[end]==target && start!=end)
         {
             a[0]=start;
             a[1]=end;
             break;
         }
            else if(end==start)
            {
                start=start+1;
                end=k-1;
            }
            else
            {
                end--;
            }
            
        }
       return a;
}
}
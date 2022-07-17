import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=target;
        int []a=new int[2];
        int i,j;
        int k=nums.length;
        HashMap<Integer,Integer> diff=new HashMap<>();
        for(i=0;i<k;i++)
        {
            if(diff.containsKey(nums[i]))
            {
                a[0]=diff.get(nums[i]);
                a[1]=i;
            }
            int difference=target-nums[i];
            diff.put(difference,i);
        }
 
        return a;
}
}
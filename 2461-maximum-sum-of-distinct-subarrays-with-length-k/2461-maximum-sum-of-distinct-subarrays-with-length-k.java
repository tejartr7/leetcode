import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int i,j,n=nums.length;
        i=0;j=0;
        long sum=0,max=0;
        while(j<n)
        {
           while(set.size()==k|| set.contains(nums[j]))
           {   sum-=nums[i];
               set.remove(nums[i]);
               i++;
           }
           set.add(nums[j]);
           sum+=nums[j];
           j++;
           if(set.size()==k)
           max=Math.max(sum,max);
        }
        return max;
    }
}
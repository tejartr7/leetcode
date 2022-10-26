import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int i,n=nums.length;
        int sum=0;
        map.put(0,0);
        for(i=0;i<n;i++)
        {
            sum+=nums[i];
            int temp=sum%k;
            if(map.containsKey(temp))
            {
                if(map.get(temp)<i)
                return true;
            }
            else
            {
                map.put(temp,i+1);
            }
        }
        return false;
    }
}
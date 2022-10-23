import java.util.HashMap;
import java.util.Map;

import javax.print.attribute.HashAttributeSet;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i], 0)+1);
        }
        int a[]=new int[2];
        for(i=1;i<=n;i++)
        {   if(map.containsKey(i))
            {
                if(map.get(i)==2)
                a[0]=i;
            }
            else if(!map.containsKey(i))
            a[1]=i;
        }
        return a;

    }
}
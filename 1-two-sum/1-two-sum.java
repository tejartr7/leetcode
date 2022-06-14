import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=target;
        int []a=new int[2];
        int i,j;
        int k=nums.length;
        for(i=0;i<k;i++)
        {for(j=i+1;j<k;j++)
            {if(nums[i]+nums[j]==x)
                { a[0]=i;
                 a[1]=j;
                  break;
                }
            }
        }
       return a;
}
}
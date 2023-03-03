class Solution {
    public int minimumCardPickup(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int i=0,j=0,n=nums.length;
        Set<Integer> set=new HashSet<>();
        while(j<n)
        {
            if(set.contains(nums[j]))
            {
                while(i<n)
                {
                    if(nums[i]==nums[j])
                    {
                        mini=Math.min(mini,j-i+1);
                        set.remove(nums[i]);
                        i++;
                        break;
                    }
                    set.remove(nums[i]);
                    i++;
                }
            }
            set.add(nums[j]);
            j++;
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}
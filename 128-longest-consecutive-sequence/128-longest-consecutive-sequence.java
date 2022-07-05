class Solution {
    public int longestConsecutive(int[] nums) {
      Arrays.sort(nums);
        int l=nums.length;
        int i;
        Set<Integer> num_set=new HashSet<>();
        for(i=0;i<l;i++)
        {
            num_set.add(nums[i]);
        }
        int max=0;
        for(int k:num_set)
        { 
            if(!num_set.contains(k-1))
            {
               int x=k;
         int y=1;
                while(num_set.contains(x+1))
                {
                    x++;
                    y++;
                }
                max=Math.max(max,y);
            }
             
        }
        return max;
        
        
    }
}
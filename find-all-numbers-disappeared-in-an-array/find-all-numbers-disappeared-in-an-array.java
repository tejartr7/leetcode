class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l=nums.length;
        Set<Integer> a=new HashSet<Integer>();
        int i;
        for(i=0;i<l;i++)
        {
            if(!a.contains(nums[i]))
                a.add(nums[i]);
        }
        List<Integer> b=new ArrayList<Integer>();
        for(i=1;i<=l;i++)
        {if(!a.contains(i))
            b.add(i);
            
        }
        return b;
        
    }
}
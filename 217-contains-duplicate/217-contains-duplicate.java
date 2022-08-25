class Solution {
    public boolean containsDuplicate(int[] nums) {
           Arrays.sort(nums);
        int i;
        int k=nums.length;
        HashMap<Integer,Integer> a=new HashMap<>();
        for(i=0;i<k;i++)
        {
            if(a.containsKey(nums[i]))
                return true;
            a.put(nums[i],i);
        }
        return false;
    }
}
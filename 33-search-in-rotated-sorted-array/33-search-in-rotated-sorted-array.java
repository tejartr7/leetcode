class Solution {
    public int search(int[] nums, int target) {
       List<Integer> a=new ArrayList<Integer>();
        int i;
        int l=nums.length;
        for(i=0;i<l;i++)
        {
            a.add(nums[i]);
            
        }
        
        return a.indexOf(target);
       
    }
}
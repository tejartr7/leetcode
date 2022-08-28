class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        generate(nums,0,new ArrayList<>(),res);
        return res;
    }
    private void generate(int []nums,int index,List<Integer> curr,List<List<Integer>> res)
    {
        res.add(new ArrayList(curr));
        for(int i=index;i<nums.length;i++)
        {
            curr.add(nums[i]);
            generate(nums,i+1,curr,res);
            curr.remove(curr.size()-1);
        }
    }
}
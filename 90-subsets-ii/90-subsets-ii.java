class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        int i,j;
        res.add(new ArrayList<>());
        for(i=0;i<nums.length;i++)
        {
            int l=res.size();
            for(j=0;j<l;j++)
            {
                List<Integer> temp=new ArrayList(res.get(j));
                temp.add(nums[i]);
                if(!res.contains(temp))
                    res.add(temp);
              
            }
        }
        return res;
    }
}
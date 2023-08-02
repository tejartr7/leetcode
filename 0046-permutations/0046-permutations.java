class Solution {
    List<List<Integer>> list;
    public void helper(int idx,int nums[] )
    {
        if(idx>=nums.length)
        {
            List<Integer> temp=new ArrayList<>();
            for(int x:nums)
            temp.add(x);
            list.add(new ArrayList<>(temp));
            return ;
        }
        for(int i=idx;i<nums.length;i++)
        {
            swap(nums,i,idx);
            helper(idx+1,nums);
            swap(nums,i,idx);
        }
    }
    void swap(int nums[],int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        list=new ArrayList<>();
        helper(0,nums);
        return list;
    }
}
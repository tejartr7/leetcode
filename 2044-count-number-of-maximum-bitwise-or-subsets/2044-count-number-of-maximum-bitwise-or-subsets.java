class Solution {
    int ans=0;
    List<List<Integer>> rtr=new ArrayList<>();
    public void helper(int nums[],int index,List<Integer> list)
    {
        rtr.add(new ArrayList<>(list));
        for(int i=index;i<nums.length;i++)
        {
            list.add(nums[i]);
            helper(nums,i+1,list);
            list.remove(list.size()-1);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int maxi=0;
        for(int x:nums)
            maxi|=x;
        helper(nums,0,new ArrayList<>());
        for(List<Integer> l:rtr)
        {
            int curr=0;
            for(int x:l)
            {
                curr|=x;
            }
            if(curr==maxi)
                ans++;
        }
        return ans;
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
        //space optimized solution
        List<Integer> lonelyList=new ArrayList<>();
        int i,n=nums.length;
        Arrays.sort(nums);
        if(n==0)
            return lonelyList;
        if(n==1)
        {
            lonelyList.add(nums[0]);
            return lonelyList;
        }
        if(nums[0]!=nums[1] && nums[0]+1!=nums[1])
            lonelyList.add(nums[0]);
        for(i=1;i<n-1;i++)
        {
            if(nums[i]==nums[i-1] || nums[i]==nums[i+1])
                continue;
            if(nums[i]==nums[i-1]+1 || nums[i]==nums[i+1]-1)
                continue;
            else
                lonelyList.add(nums[i]);
        }
        if(nums[n-1]-1!=nums[n-2] && nums[n-1]!=nums[n-2])
            lonelyList.add(nums[n-1]);
        return lonelyList;
    }
}
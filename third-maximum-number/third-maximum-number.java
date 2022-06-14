class Solution {
    public int thirdMax(int[] nums) {
        int l=nums.length;
        Arrays.sort(nums);
        int i;
        List<Integer>a=new ArrayList<Integer>();
        for(i=0;i<l;i++)
        {
            if(!a.contains(nums[i]))
                a.add(nums[i]);
        }
        if(a.size()<3)
            return a.get(a.size()-1);
        return a.get(a.size()-3);
        
        
    }
}
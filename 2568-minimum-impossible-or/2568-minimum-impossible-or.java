class Solution {
    public int minImpossibleOR(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums) set.add(x);
        int ans=1;
        while(set.contains(ans))
        {
            ans<<=1;
        }
        return ans;
    }
}
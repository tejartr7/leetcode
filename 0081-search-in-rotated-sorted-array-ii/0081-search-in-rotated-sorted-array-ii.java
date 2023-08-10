class Solution {
    public boolean search(int[] nums, int target) {
        for(int x:nums)
            if(x==target)
                return true;
        return false;
    }
}
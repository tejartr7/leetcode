class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min=Integer.MAX_VALUE;
        int secondMin=min;
        for(int x:nums)
        {
            if(x<=min)
                min=x;
            else if(x<secondMin)
                secondMin=x;
            else if(x>secondMin)
                return true;
        }
        return false;
    }
}
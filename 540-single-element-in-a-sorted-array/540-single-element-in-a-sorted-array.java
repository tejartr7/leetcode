class Solution {
    public int singleNonDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i;
        int sum=0;
        int l=nums.length;
        for(i=0;i<l;i++)

        {
    sum^=nums[i];
        }
    return sum;}
}
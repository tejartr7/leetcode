class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Set<Integer> set=new HashSet<>();
        int i;
        int ans=-1;
        for(int x:nums2)
        {
            set.add(x);
        }
        for(i=0;i<nums1.length;i++)
        {
            if(set.contains(nums1[i]))
            {
                ans=nums1[i];
                break;
            }
        }
        return ans;
    }
}
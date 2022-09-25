class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> l1=new HashSet<>();
        Set<Integer> l2=new HashSet<>();
        int i,j,n1=nums1.length,n2=nums2.length;
        for(i=0;i<n1;i++)
        {
            l1.add(nums1[i]);
        }
        for(i=0;i<n2;i++)
        {
            l2.add(nums2[i]);
        }
        List<Integer> a1=new ArrayList<>();
        List<Integer> a2=new ArrayList<>();
        for(i=0;i<n1;i++)
        {
            if(!l2.contains(nums1[i]) && !a1.contains(nums1[i]))
            {
                a1.add(nums1[i]);
            }
        }
        for(i=0;i<n2;i++)
        {
            if(!l1.contains(nums2[i]) && !a2.contains(nums2[i]))
            {
                a2.add(nums2[i]);
            }
        }
        List<List<Integer>> x=new ArrayList<>();
        x.add(a1);
        x.add(a2);
        return x;
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     List<Integer>a=new ArrayList<Integer>();
         List<Integer>b=new ArrayList<Integer>();
      //   List<Integer>c=new ArrayList<Integer>();
        int i;
        int l=nums1.length;
        for(i=0;i<l;i++)
        {
          if(!a.contains(nums1[i]))
                a.add(nums1[i]);
            
        }
        int l2=nums2.length;
        for(i=0;i<l2;i++)
        {
          if(!b.contains(nums2[i]))
                b.add(nums2[i]);
        }
        a.retainAll(b);
        int []r=new int[a.size()];
        int p=0;
       for(int o:a)
       {
           r[p++]=o;
       }
        return r;
    }
    
}
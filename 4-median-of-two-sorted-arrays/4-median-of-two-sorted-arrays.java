class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int l1=nums1.length;
        int l2=nums2.length;
        int i;
        int []a=new int[l1+l2];
        for(i=0;i<l1;i++)
        {
            a[i]=nums1[i];
        }
        for(i=l1;i<l1+l2;i++)
        {
            a[i]=nums2[i-l1];
        }
        Arrays.sort(a);
        if(a.length%2==1)
            return (double)a[(l1+l2)/2];
        else
        {
            int k=a[(l1+l2)/2];
            int b=a[(l1+l2-2)/2];
            return (double)(k+b)/2;
        }  
    }
}
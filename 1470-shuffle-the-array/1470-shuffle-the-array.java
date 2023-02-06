class Solution {
    public int[] shuffle(int[] nums, int n) {
        int l=nums.length;
        int i;
        int j=n;
        int k=0;
        int []a=new int[l];
        Arrays.fill(a,0);
       for(i=0;i<l;i++)
       {
           if(i%2==0)
           {
               a[i]=nums[k];
               k++;
           }
           else
           {
               a[i]=nums[j];
               j++;
           }
               
       }
        return a;
    }
}
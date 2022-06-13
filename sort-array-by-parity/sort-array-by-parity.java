class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int l=nums.length;
        int []a=new int[l];
        int i,j;
        int count=0;
        for(i=0;i<l;i++)
        {
            if(nums[i]%2==0)
            {a[count]=nums[i];
            count++;}
        }
        for(i=0;i<l;i++)
        {
            if(nums[i]%2==1)
            {
                a[count]=nums[i];
            count++;
            }
        }
        return a;
    }
}
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int i=0,j,k=0,n=nums.length;
        j=n-1;
        int arr[]=new int[n];
        while(k<n)
        {
            
            arr[k]=nums[j--];
            k+=2;
        }
        k=1;
        while(k<n)
        {
            arr[k]=nums[i++];
            k+=2;
        }
        return arr;
    }
}
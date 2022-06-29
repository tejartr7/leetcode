class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l=nums.length;
        
        int a[]=new int[l];
        int i=0;
        int j=l-1;
        int k;
        for(k=0;k<l;k++)
            a[k]=nums[k];
        Arrays.sort(a);
        while(i<l && nums[i]==a[i])
            i++;
        while(j>i && nums[j]==a[j])
            j--;
        return j-i+1;
    }
}
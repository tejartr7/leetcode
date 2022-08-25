class NumArray {
    int a[];
    public NumArray(int[] nums) {
        int n=nums.length;
        a=new int[n+1];
        int i;
        for(i=1;i<=n;i++)
        {
         a[i]=a[i-1]+nums[i-1];   
        }
    }
    
    public int sumRange(int left, int right) {
        return a[right+1]-a[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
class NumArray {
    int a[];
    int total=0;
    int i;
    public NumArray(int[] nums) {
        int l=nums.length;
        a=new int[l];
        for(i=0;i<l;i++)
        {
            a[i]=nums[i];
            total+=a[i];
        }
    }
    public void update(int index, int val) {
       total=total+val-a[index];
             a[index]=val;
    }
    public int sumRange(int left, int right) {
        int sum=total;
     
        for(i=0;i<left;i++)
        sum-=a[i];
        for(i=right+1;i<a.length;i++)
            sum-=a[i];
        return sum;
    }
}
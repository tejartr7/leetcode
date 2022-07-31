class NumArray {
    int a[];
    int total=0;
    int i;
     int l;
    public NumArray(int[] nums) {
        l=nums.length;
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
      int m=right-left+1;
    int n=l+left-right-1;
        if(m>n){
        for(i=0;i<left;i++)
        sum-=a[i];
        for(i=right+1;i<a.length;i++)
            sum-=a[i];
        }
        else
        {
            sum=0;
            for(i=left;i<=right;i++)
                sum+=a[i];
        }    
        
        return sum;
    }
}
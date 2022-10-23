class Solution {
    public void swap(int a[],int start,int end)
    {
        int temp=a[start];
        a[start]=a[end];
        a[end]=temp;
    }
    public void heapify(int []a,int n,int i)
    {
        int index=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && a[left]>a[index])
        {
            index=left;
        }
        if(right<n && a[right]>a[index])
        {
            index=right;
        }
        if(index!=i)
        {
            swap(a,index,i);
            heapify(a,n,index);
        }
        
    }
    public int[] sortArray(int[] nums) {
        int i;
        int n=nums.length;
         for(i=n/2;i>=0;i--)
        {
            heapify(nums,n,i);
        }
        for(i=n-1;i>=0;i--)
        {
            swap(nums,0,i);
            heapify(nums,i,0);
        }
        return nums;
    }
}
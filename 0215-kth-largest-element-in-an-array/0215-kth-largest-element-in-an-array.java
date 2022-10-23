class Solution {
    public int getPiv(int a[],int low,int high)
    {
        int pivotElement=a[high];
        int pivotIndex=low;
        int i;
        for(i=low;i<=high;i++)
        {
            if(a[i]<pivotElement)
            {
                int temp=a[pivotIndex];
                a[pivotIndex]=a[i];
                a[i]=temp;
                pivotIndex++;
            }
        }
        int temp=a[high];
        a[high]=a[pivotIndex];
        a[pivotIndex]=temp;
        return pivotIndex;
    }
    public int getSmall(int a[],int k,int low,int high)
    {
        int x=getPiv(a,low,high);
        if(x==k-1)
            return a[x];
        else if(x<k-1)
           return getSmall(a,k,x+1,high);
        else
           return getSmall(a,k,low,x-1);
        
    }
        
    public int findKthLargest(int[] nums, int k) {
    return getSmall(nums,nums.length-k+1,0,nums.length-1);    
    }
}
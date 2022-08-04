class Solution {

  
    private void merge(int a[],int start,int mid,int end)
    {
        int x=start;
        int y=mid+1;
        int z=0;
        int c[]=new int[end-start+1];
        while(x<=mid && y<=end)
        {
            if(a[x]<=a[y])
                c[z++]=a[x++];
            else
                c[z++]=a[y++];
        }
        while(x<=mid)
        {
            c[z++]=a[x++];
        }
        while(y<=end)
            c[z++]=a[y++];
        int i,j;
        for(i=0,j=start;i<c.length;i++,j++)
        {
           a[j]=c[i]; 
        }
    }
    
    private void mergesort(int arr[],int a,int b)
    {
        if(a<b)
        {
            int mid=a+(b-a)/2;
            mergesort(arr,a,mid);
            mergesort(arr,mid+1,b);
            merge(arr,a,mid,b);
        }
    }
    public void sortColors(int[] nums) {
     
      
        mergesort(nums,0,nums.length-1); 
      
        
        
    }
}
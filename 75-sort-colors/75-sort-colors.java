class Solution {
   public static void merge(int arr[], int si, int mid, int ei) {
int merged [] = new int [ei-si+1] ;
int idx1 = si;
int idx2 = mid+1;
int x = 0;
while (idx1 <= mid && idx2 <= ei) {
if(arr[idx1] <= arr [idx2]) {
merged [x++] = arr[idx1++] ;
                   }
else {
merged [x++] = arr[idx2++] ;
}
                   }
while (idx1<= mid)
{merged [x++] = arr[idx1++] ;
}
while ( idx2 <= ei) {
merged [x++] = arr[idx2++];
}
for(int i=0, j=si; i<merged. length; i++, j++) {
arr[j] = merged [i];
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
       int i;
       int start=0,end=nums.length-1;
        mergesort(nums,start,end); 
      
        
        
    }
}
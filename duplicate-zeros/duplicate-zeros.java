class Solution {
    public void duplicateZeros(int[] arr) {
        int i;
        int l=arr.length;
        int []a=new int[l];
        int j=0;
        if(j<l){
        for(i=0;i<l;i++)
        {
            if(arr[j]!=0 )
            {
                a[i]=arr[j];
                
               
               
            }
            else
            { if(i+1<l){
                a[i]=arr[j];
                 a[i+1]=0;
                i=i+1;
            }
            }
            j++;
        }
        }
         for(i=0;i<l;i++)
        {arr[i]=a[i];
        }
        
    }
}
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count=0;
        int i,j,n1=arr1.length,n2=arr2.length;
        for(i=0;i<n1;i++)
        {   boolean y=true;
            for(j=0;j<n2;j++)
            {
                int x=Math.abs(arr1[i]-arr2[j]);
                if(x<=d)
                {
                y=false;
                break;
                }
               
            }
         if(y)
             count++;
        }
        return count;
    }
}
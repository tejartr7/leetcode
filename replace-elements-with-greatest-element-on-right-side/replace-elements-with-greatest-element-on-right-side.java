class Solution {
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        int max=0;
        
        int i,j;
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                max=Math.max(arr[j],max);
            }
            arr[i]=max;
            max=0;
        }
        arr[l-1]=-1;
        return arr;
    }
}
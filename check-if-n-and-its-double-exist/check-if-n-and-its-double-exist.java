class Solution {
    public boolean checkIfExist(int[] arr) {
        
        int i,j;
        int l=arr.length;
        for(i=0;i<l;i++)
        {
            for(j=i+1;j<l;j++)
            {
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i])
                    return true;
            }
        }
        return false;
    }
}
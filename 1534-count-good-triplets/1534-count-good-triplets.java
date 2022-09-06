class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
      
        int l=arr.length;
    
        int count=0;
       for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                        if(i<j && Math.abs(arr[i]-arr[j])<=a)
                        {
                            if(i<k && Math.abs(arr[i]-arr[k])<=c)
                        {
                                if(j<k && Math.abs(arr[j]-arr[k])<=b)
                        {
                            count++;
                                }
                            }
                        }
                 }
             }
        }
        return count;
    }
}
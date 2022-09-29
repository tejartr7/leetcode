class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i,n=arr.length;
        List<Integer> result=new ArrayList<>();
        int start=0,end=n-1;
        while(end-start>=k)
        {
            int diff1=Math.abs(arr[start]-x);
            int diff2=Math.abs(arr[end]-x);
            if(diff1>diff2)
                start++;
            else
                end--;
        }
        while(start<=end)
        {    result.add(arr[start]);
             start++;}
        
        return result;
    }
}
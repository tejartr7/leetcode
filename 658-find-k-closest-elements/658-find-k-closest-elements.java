class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
            int start=0;
            int end=arr.length-1;
            List<Integer> ans=new ArrayList<>();
            while(end-start>=k)
            {
                int diff1=Math.abs(arr[start]-x);
                int diff2=Math.abs(arr[end]-x);
                if(diff1<=diff2)
                end--;
                else
                start++;
            }
            while(start<=end)
            ans.add(arr[start++]);
            return ans;
    }
}
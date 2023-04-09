class Solution {
    public int[] sortByBits(int[] arr) {
        TreeMap<Integer,TreeSet<Integer>> map=new TreeMap<>();
        int i,n=arr.length;
        for(i=0;i<n;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }
        Arrays.sort(arr);
        for(i=0;i<n;i++)
            arr[i]%=10001;
        return arr;
    }
}
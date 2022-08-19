class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        int i;
        List<List<Integer>> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(i=1;i<l;i++)
        {
            min=Math.min(min,arr[i]-arr[i-1]);
        }
       
      
        for(i=0;i<l-1;i++)
        {
            if(arr[i+1]-arr[i]==min)
            {
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}
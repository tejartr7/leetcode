class Solution {
    public boolean valid(int a[],int b[],int i)
    {
        List<Integer> list=new ArrayList<>();
        for(int k=0;k<=i;k++)
        {
            list.add(a[k]);
        }
        Collections.sort(list);
        for(int k=0;k<=i;k++)
        {
            if(list.get(k)!=b[k])
                return false;
        }
        return true;
    }
    public int maxChunksToSorted(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int count=0;
        int i,n=arr.length;
        int brr[]=new int[n];
        for(i=0;i<n;i++)
            brr[i]=arr[i];
        Arrays.sort(brr);
        for(i=0;i<n;i++)
        {
            if(valid(arr,brr,i))
                count++;
        }
        return count;
    }
}
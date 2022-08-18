class Solution {
    public int minSetSize(int[] arr) {
        int l=arr.length;
        int i;
        Map<Integer,Integer> a=new HashMap<>();
        for(i=0;i<l;i++)
        {
            a.put(arr[i],a.getOrDefault(arr[i],0)+1);
            
        }
        int s=a.size();
        int b[]=new int[s];
        int j=0;
        for(int k:a.keySet())
        {
            b[j]=a.get(k);
            j++;
        }
        Arrays.sort(b);
        int count=0;
        int sum=0;
        
        while(sum<l/2)
        {
            sum+=b[s-1];
            count++;
            s--;
        }
        return count;
    }
}
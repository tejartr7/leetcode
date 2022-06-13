class Solution {
    public int findLucky(int[] arr) {
       Arrays.sort(arr);
        int l=arr.length;
        int max=-1;
        int o=arr[l-1];
       int []a=new int[o+1];
        int i;
        Arrays.fill(a,0);
        for(i=0;i<l;i++)
        {
           a[arr[i]]++;
        }
         for(i=1;i<arr[arr.length-1]+1;i++)
        { if(i==a[i])
        {
            max=Math.max(max,a[i]);
        }
        }
        return max;
        
    }
}
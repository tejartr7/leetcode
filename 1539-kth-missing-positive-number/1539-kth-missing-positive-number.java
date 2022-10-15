import java.util.Set;

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        int i=1;
        Set<Integer> a=new HashSet<Integer>();
        int n=arr.length;
        for(i=0;i<n;i++)
        {
            a.add(arr[i]);
        }
        i=1;
        while(k>0)
        {
            if(!a.contains(i))
            k--;
            if(k==0)
            return i;
            i++;
        }
        return i;
    }
}
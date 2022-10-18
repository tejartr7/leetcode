class Solution {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set=new HashSet<>();
        int i,n=arr.length;
        for(i=0;i<n;i++)
        {   if(set.contains(arr[i]/2) ||set.contains(arr[i]*2))
            {
            if(arr[i]%2==1 && set.contains(arr[i]*2))
                return true;
             if(arr[i]%2==0)
             {
                 if(set.contains(arr[i]*2) || set.contains(arr[i]/2))
                     return true;
             }
            
            }
            set.add(arr[i]);
        }
        return false;
    }
}
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int l=arr.length;
        if(l<=1)
            return true;
        int i;
        int d=arr[1]-arr[0];
        for(i=2;i<l;i++)
        {
            if(d!=arr[i]-arr[i-1])
                return false;
        }
        return true;
        
    }
}
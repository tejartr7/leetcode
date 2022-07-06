class Solution {
    public int xorOperation(int n, int start) {
        int arr[]=new int[n];
        int index;
         int Xor=start;
        arr[0]=start;
        for(index=1;index<n;index++)
        {
            arr[index]=start+2*index;
            Xor^=arr[index];
        }
        return Xor;
        
    }
}
class Solution {
    public int change(int amount, int[] coins) {
        int arr[] = new int[amount+1];
        Arrays.fill(arr, 0);
        arr[0] = 1;
        for(int i:coins)
        {
            for(int j=i;j<=amount;j++)
            {
                arr[j]+=arr[j-i];
            }
        }
        return arr[amount];
    }
}
class Solution {
    public void merge(int[] arr1, int m, int[] arr2, int n) {
        int j = 0;
        for(int i = m; i<arr1.length; i++){
            arr1[i] = arr2[j];
            j++;
        }
        Arrays.sort(arr1);
        
    }
}
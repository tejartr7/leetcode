class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       Arrays.sort(boxTypes, (x, y) -> (y[1] - x[1]));
        int res = 0;
        
        for (int[] box : boxTypes) {
            truckSize -= box[0];
            res += box[0] * box[1];
            if (truckSize <= 0) return res += truckSize * box[1];
        }
        
        return res;  
    }
}
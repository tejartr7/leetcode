class Solution {
    public int minBitFlips(int start, int goal) {
       int c=start^goal;
        return Integer.bitCount(c);
        
    }
}
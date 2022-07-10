class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int count=0;
        int l=piles.length;
        int i;
        for(i=l-2;i>=l/3;i-=2)
        {
            count+=piles[i];
        }
        return count;
    }
}
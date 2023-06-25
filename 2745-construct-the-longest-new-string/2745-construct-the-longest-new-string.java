class Solution {
    public int helper(String s, int x, int y, int z, int[][][] dp) {
        int count=0;
        while(x>0 && y>0){
            count+=2;
            count+=2;
            x--;
            y--;   
        }
        if(x>=1) count+=2;
        if(y>=1) count+=2;
        count+=(z*2);
        return count;
    }

    public int longestString(int x, int y, int z) {
        int count=0;
        while(x>0 && y>0){
            count+=2;
            count+=2;
            x--;
            y--;   
        }
        if(x>=1) count+=2;
        if(y>=1) count+=2;
        count+=(z*2);
        return count;
    }
}
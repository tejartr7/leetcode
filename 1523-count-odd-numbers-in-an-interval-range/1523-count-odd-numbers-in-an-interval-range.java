class Solution {
    public int countOdds(int low, int high) {
         int k=high-low;
         if(low%2==0 && high%2==0)
             return k/2;
        else
            return k/2+1;
       
       
    }
}
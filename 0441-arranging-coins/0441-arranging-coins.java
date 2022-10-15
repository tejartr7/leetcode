class Solution {
    public int arrangeCoins(int n) {
      int count=0,i=1;
        while(n>0)
        {   if(n<i)
                return count;
            n-=i;
            i++;
            count++;
            
        }
        return count;
    }
}
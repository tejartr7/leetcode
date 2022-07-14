class Solution {
    public int countOdds(int low, int high) {
       int k=high-low;
     
        if(low%2==1 && high%2==1)
            return k/2+1;
        else if(k%2==0 && high%2==0)
            return k/2;
        else
        {
        int count=0;
       for(int i=low;i<=high;i++)
       {
           if(i%2==1)
               count++;
       }
            return count;
        }
       
    }
}
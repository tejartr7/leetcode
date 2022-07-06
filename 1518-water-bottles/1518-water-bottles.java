class Solution {
    public int numWaterBottles(int a, int b) {
        int k=0;
        int l=0;
        while(a>0)
        {
           k+=a;
            l+=a;
            
            a=l/b;
            l%=b;
            
           
        }
        return k;
        
    }
}
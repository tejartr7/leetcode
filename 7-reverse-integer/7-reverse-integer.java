class Solution {
    public int reverse(int x) {
        long r=0;
        int k=x/10;
        int l;
        int count=0;
    
        while(x!=0)
        {
            l=x%10;
            r=r*10+l;
        
            x=x/10;
            count++;
            
        }
       
       
         if(r>Integer.MAX_VALUE|| r<Integer.MIN_VALUE){
            return 0;
        }
            return (int)r;
    
        
    }
}
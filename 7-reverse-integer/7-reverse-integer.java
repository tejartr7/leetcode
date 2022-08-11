class Solution {
    public int reverse(int x) {
        long r=0;
        int l;
        while(x!=0)
        {l=x%10;
         r=r*10+l;
         x=x/10;
        }
        if(r>Integer.MAX_VALUE|| r<Integer.MIN_VALUE){
            return 0;
        }
        return (int)r;
    
        
    }
}
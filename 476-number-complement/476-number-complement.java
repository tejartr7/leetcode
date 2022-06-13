class Solution {
    public int findComplement(int num) {
        if(num==1)
            return 0;
       
       String bin = Integer.toBinaryString(num); 
        int l=bin.length();
        if(l==31)
            return 2147483647-num;
         
        return (int)Math.pow(2,l)-1-num;
       
    }
}
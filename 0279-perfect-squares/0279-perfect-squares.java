public class Solution {
public int numSquares(int n) {

// Lagrange's Four Square theorem : every positive integer can be written as the sum of at most four squares
       // answer to this question can be 1 or 2 or 3 or 4 only.
	   
	   
        if(n == 0) return 0;
        
		// case 1:
        if(isSqrt(n)) return 1;
        
		   // case 2 :If answer is 2 => one factor has to be (int)square_root and remaining other number has to be a perfect square
        for(int i=1; i<=Math.sqrt(n); i++){
            if(isSqrt(n-(i*i))) return 2;
        }
        
		 // case 4: a positive integer can be expressed as the sum of three squares if and only if it is not of the form 4^k(8m+7) for some int k and m see "not of" in above line
		 
        // in order to pass 28 as 4
        while(n%4 ==0)
            n=n/4;
        
        if(n%8 == 7){
            return 4;    // handling 4^k
        }
        
		 // case 3
        return 3;
    }
    
    private boolean isSqrt(int n){
        int sqrt = (int)Math.sqrt(n);
        
        return n-(sqrt*sqrt)==0;
    }
}
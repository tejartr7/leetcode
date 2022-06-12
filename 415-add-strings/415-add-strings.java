import java.math.*;
class Solution {
    public String addStrings(String num1, String num2) {
     BigInteger a=new BigInteger(num1);
         BigInteger b=new BigInteger(num2);
        BigInteger r=b.add(a);
        String k=String.valueOf(r);
        return k;
        
    }
}
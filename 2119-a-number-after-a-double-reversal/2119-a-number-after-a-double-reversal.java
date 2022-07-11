class Solution {
    private int rev(int k)
       {  int rev=0;
           while(k>0)
           {
               int x=k%10;
               rev=rev*10+x;
               k=k/10;      
           }
        return rev;
       }
   public boolean isSameAfterReversals(int num) {
      int a=rev(num);
      int b=rev(a);
       if(b==num)
           return true;
       return false;
   }
}
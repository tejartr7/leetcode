class Solution {
    private boolean checkSum(int n)
    {   int sum=0;
        while(n>0)
        {int r=n%10;
         sum=sum+r;
         n=n/10;
            
        }
       if(sum%2==0)
         return true;
     return false;
    }
    public int countEven(int num) {
       if(checkSum(num))
       {
           return num/2;
       }
        return (num-1)/2;
    }
}
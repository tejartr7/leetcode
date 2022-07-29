class Solution {
    private boolean check(int n)
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
        int i;
        int count=0;
        if(num==1)
            return 0;
        if(num==2)
            return 1;
        for(i=1;i<=num;i++)
        { 
            
           boolean x=check(i);
            if(x)
                count++;
        }
        return count;
    }
}
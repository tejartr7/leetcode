class Solution {
    private boolean nozero(int x)
    {
        int k=x;
        while(k>0)
        {
            int r=k%10;
            if(r==0)
                return false;
            k=k/10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int a=1;
        int b=n-a;
        int x[]=new int[2];
        while(a<=b)
        {
            if(a+b==n && nozero(a) && nozero(b))
            {
                x[0]=a;
                x[1]=b;
                return x;
            }
            else
            {
                a++;
                b--;
            }
        }
        
        return x;
            
        
    }
}
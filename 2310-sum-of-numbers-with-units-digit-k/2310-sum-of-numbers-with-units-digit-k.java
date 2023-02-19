class Solution {
    public int minimumNumbers(int num, int k) {
        int i;
        if(num==0) return 0;
        for(i=1;i<=10;i++)
        {
            if((i*k)%10==num%10 && num>=i*k)
                return i;
        }
        return -1;
    }
}
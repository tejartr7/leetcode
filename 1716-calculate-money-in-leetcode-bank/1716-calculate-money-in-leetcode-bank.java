class Solution {
    public int totalMoney(int n) {
        if(n<=7)
            return n*(n+1)/2;
        int money=0;
        int start=1;
        while(n>0)
        {
            int days=Math.min(7,n);
            for(int i=0;i<days;i++)
            {
                money+=start+i;
                n--;
            }
            start++;
                
        }
        return money;
    }
}
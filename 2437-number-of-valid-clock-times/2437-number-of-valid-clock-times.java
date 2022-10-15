class Solution {
    public int countTime(String time) {
        int count1=1;
        int count2=1;
        String a[]=time.split(":");
        if(a[0].equals("??"))
            count1=24;
        if(a[1].equals("??"))
            count2=60;
        int x=0,y=0;
        int temp=0;
        if(a[0].charAt(0)=='?' && a[0].charAt(1)!='?')
        {   while(temp<=9){
            a[0]=String.valueOf(temp)+a[0].charAt(1);
            int tem=Integer.parseInt(a[0]);
            if(0<=tem && tem<=23)
            {
                x++;
            }
            temp++;
        }
        }
        temp=0;
        if(a[0].charAt(0)!='?' && a[0].charAt(1)=='?')
        {   while(temp<=9){
            a[0]=a[0].charAt(0)+String.valueOf(temp);
            int tem=Integer.parseInt(a[0]);
            if(0<=tem && tem<=23)
            {
                x++;
            }
            temp++;
        }
        }
        temp=0;
        if(a[1].charAt(0)=='?' && a[1].charAt(1)!='?')
        {   while(temp<=9){
            a[1]=String.valueOf(temp)+a[1].charAt(1);
            int tem=Integer.parseInt(a[1]);
            if(0<=tem && tem<=59)
            {
                y++;
            }
            temp++;
        }
        }
        temp=0;
        if(a[1].charAt(0)!='?' && a[1].charAt(1)=='?')
        {   while(temp<=9){
            a[1]=a[1].charAt(0)+String.valueOf(temp);
            int tem=Integer.parseInt(a[1]);
            if(0<=tem && tem<=59)
            {
                y++;
            }
            temp++;
        }
        }
        if(count1!=24 && x>1)
        {
            count1+=(x-1);
        }
        if(count1!=60 && y>1)
        {
            count2+=(y-1);
        }
        return count1*count2;
    }
}
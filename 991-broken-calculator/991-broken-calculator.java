class Solution {
    public int brokenCalc(int startValue, int target) {
        int count=0;
        int x=target;
        if(x==startValue)
        {
            return 0;
        }
        if(x<startValue)
        {
            return startValue-x;
        }
        else if((x&1)==1)
        {
            count+=2;
            x++;
            return count+=brokenCalc(startValue,x/2);
        }
        else
        {
            count++;
            return count+brokenCalc(startValue,x/2);
        }
        
    }
}
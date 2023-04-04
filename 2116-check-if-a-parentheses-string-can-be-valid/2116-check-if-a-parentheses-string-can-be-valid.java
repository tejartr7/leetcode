class Solution {
    public boolean canBeValid(String s, String locked) {
        Stack<Integer> stack=new Stack<>();
        boolean ans=true;
        int i,n=locked.length();
        if(n%2==1)
            return false;
        int maxOpens=0,fixedClose=0;
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='(' || locked.charAt(i)=='0')
            {
                maxOpens++;
            }
            else
            {
                fixedClose++;
            }
            if(fixedClose>maxOpens)
                return false;
        }
        int maxClose=0,fixedOpen=0;
        for(i=n-1;i>=0;i--)
        {
            if(s.charAt(i)==')' || locked.charAt(i)=='0')
                maxClose++;
            else
                fixedOpen++;
            if(fixedOpen>maxClose)
                return false;
        }
        return true;
    }
}
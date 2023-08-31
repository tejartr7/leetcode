class Solution {
    public boolean rotateString(String s, String goal) {
        String temp=s;
        int i,n=s.length();
        if(s.length()!=goal.length())
            return false;
        for(i=0;i<n;i++)
        {
            temp=s.substring(i+1)+s.substring(0,i+1);
            if(temp.equals(goal))
                return true;
        }
        return false;
    }
}
class Solution {
    public boolean rotateString(String s, String goal) {
        String ans=s+s;
        if(s.length()!=goal.length())
            return false;
        else if(ans.contains(goal))
            return true;
        return false;
    }
}
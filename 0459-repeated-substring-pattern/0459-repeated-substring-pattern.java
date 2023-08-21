class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String k=s+s;
        String p=k.substring(1,k.length()-1);
        if(p.contains(s))
            return true;
        return false;
    }
}
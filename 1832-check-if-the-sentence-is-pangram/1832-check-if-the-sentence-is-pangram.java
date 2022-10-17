class Solution {
    public boolean checkIfPangram(String s) {
        boolean a[]=new boolean[26];
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            a[s.charAt(i)-'a']=true;
        }
        for(i=0;i<26;i++)
        {
            if(!a[i])
                return false;
        }
        return true;
    }
}
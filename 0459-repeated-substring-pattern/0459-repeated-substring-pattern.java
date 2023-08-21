class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int i,n=s.length();
        if(n==1) return false;
        for(i=0;i<n/2;i++)
        {
            String sub=s.substring(0,i+1);
            if(n%sub.length()!=0)
                continue;
            String temp=s;
            //System.out.println(sub);
            temp=temp.replaceAll(sub,"");
            if(temp.length()==0)
                return true;
        }
        return false;
    }
}
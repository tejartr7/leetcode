class Solution {
    public boolean helper(int i,String s,List<Long> list)
    {
        if(i>=s.length()) return list.size()>=2;
        long n=0;
        for(int k=i;k<s.length();k++)
        {
            n=n*10+(s.charAt(k)-'0');
            if(list.size()==0 || list.get(list.size()-1)-n==1)
            {
                list.add(n);
                if(helper(k+1,s,list)) return true;
                list.remove(list.size()-1);
            }

        }
        return false;
    }
    public boolean splitString(String s) {
        if (s == null || s.length()<=1) return false;
        return  helper(0,s,new ArrayList<Long>());
    }
}
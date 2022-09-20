class Solution {
    public String greatestLetter(String s) {
       Set<String> a=new HashSet<>();
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            a.add(String.valueOf(s.charAt(i)));
        }
        List<String> ans=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            String aa=String.valueOf(ch);
            aa=aa.toLowerCase();
            String b=String.valueOf(ch);
            b=b.toUpperCase();
            if(a.contains(aa) && a.contains(b) && !ans.contains(aa))
                ans.add(b);
        }
        Collections.sort(ans);
        if(ans.size()==0)
            return "";
        return ans.get(ans.size()-1);
        
    }
}
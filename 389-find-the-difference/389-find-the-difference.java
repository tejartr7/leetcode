class Solution {
    public char findTheDifference(String s, String t) {
        char c[]=s.toCharArray();
        int i;
        int n=s.length();
        Map<Character,Integer> ans=new HashMap<>();
         Map<Character,Integer> ans2=new HashMap<>();
        for(i=0;i<n;i++)
        {
           ans.put(s.charAt(i),ans.getOrDefault(s.charAt(i),0)+1);
        }
        for(i=0;i<t.length();i++)
        {
           ans2.put(t.charAt(i),ans2.getOrDefault(t.charAt(i),0)+1);
        }
        for(i=0;i<t.length();i++)
        {
            if(ans.get(t.charAt(i))!=ans2.get(t.charAt(i)))
                return t.charAt(i);
        }
        return '1';
    }
}
class Solution {
    public int check(int start,int end,String word)
    {
        String s=word.substring(Math.max(start,0),end);
        System.out.println(s);
        if(!s.contains("a") ||!s.contains("e") ||!s.contains("i") ||!s.contains("o") ||!s.contains("u"))
            return -1;
        int len=0;
        int prev=0;
        int i;
        for(i=0;i<s.length();i++)
        {
            if(prev>s.charAt(i)-'a')
                break;
        }
        return i==s.length()?i:i+1;
    }
    public int longestBeautifulSubstring(String word) {
        int maxi=0;
        Set<Character> set=new HashSet<>();
        Set<Character> temp=new HashSet<>();
        String x="aeiou";
        int i,n=word.length();
        for(i=0;i<5;i++)
        { set.add(x.charAt(i));
          temp.add(x.charAt(i));}
        int prev=-1;
        int index=-1;
        for(i=0;i<n;i++)
        {
            int curr=word.charAt(i)-'a';
            if(curr<prev)
            {
                int val=check(index,i,word);
                if(val>0)
                {
                    //System.out.println(val);
                    maxi=Math.max(val,maxi);
                }
                index=i;
            }
            prev=curr;
        }
        int val=check(index,n,word);
        if(val>0)
            maxi=Math.max(val,maxi);
        return maxi;
    }
}
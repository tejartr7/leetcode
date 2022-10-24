class Solution {
    public boolean check(String k)
    {
        int i,n=k.length();
        int a[]=new int[26];
        for(i=0;i<n;i++)
        {
            char ch=k.charAt(i);
            if(a[ch-'a']!=0)
                return false;
            a[ch-'a']++;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        int i;
       // String temp="";
        int ans=0;
        List<String> temp=new ArrayList<>();
        for(String k:arr)
        {
            if(!check(k))
                continue;
            List<String> a=new ArrayList<>();
            a.add(k);
            ans=Math.max(ans,k.length());
            for(String x:temp)
            {
                String s=x+k;
                if(check(s))
                {
                    a.add(s);
                    ans=Math.max(s.length(),ans);
                }
            }
            temp.addAll(a);
        }
        return ans;
    }
}
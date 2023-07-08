class Solution {
    public long numberOfWays(String s) {
        int i,n=s.length();
        long ans=0;
        Map<String,Long> map=new HashMap<>();
        long a=0l;
        long b,c,d;
        b=c=d=a;
        //map.put("101",0l);
       // map.put("010",0l);
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                ans+=d;
                b+=1;
                c+=a;
            }
            else
            {
                ans+=c;
                a+=1;
                d+=b;
            }
        }
        return ans;
    }
}
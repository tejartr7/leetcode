class Solution {

    public long numberOfWays(String s) {
        int i,n=s.length();
        long ans=0;
        Map<String,Long> map=new HashMap<>();
        map.put("0",0l);
        map.put("1",0l);
        map.put("10",0l);
        map.put("01",0l);
        map.put("101",0l);
        map.put("010",0l);
        for(i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
            {
                ans+=map.get("10");
                map.put("1",map.get("1")+1);
                map.put("01",map.get("01")+map.get("0"));
            }
            else
            {
                ans+=map.get("01");
                map.put("0",map.get("0")+1);
                map.put("10",map.get("10")+map.get("1"));
            }
        }
        return ans;
    }
}
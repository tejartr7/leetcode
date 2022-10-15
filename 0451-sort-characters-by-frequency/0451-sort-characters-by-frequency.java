class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int i,n=s.length();
        for(i=0;i<n;i++)
        {
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Character> pq=new 
        PriorityQueue<>((a,b)->(map.get(b)-map.get(a)));
        pq.addAll(map.keySet());
        String x="";
        while(!pq.isEmpty())
        {
            char ch=pq.remove();
            int count=map.get(ch);
            String k=String.valueOf(ch);
            String l=k.repeat(count);
            x+=l;
        }
        return x;
    }
}
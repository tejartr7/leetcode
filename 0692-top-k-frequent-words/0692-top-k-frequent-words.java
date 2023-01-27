class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       int i,n=words.length;
       Map<String,Integer> map=new HashMap<>();
       for(i=0;i<n;i++)
       {
           map.put(words[i],map.getOrDefault(words[i],0)+1);
       } 
       List<String> list=new ArrayList<>(map.keySet());
       Collections.sort(list,(a,b)->map.get(a).equals(map.get(b)) ?
a.compareTo(b) : map.get(b) - map.get(a));
       return list.subList(0,k);
    }
}
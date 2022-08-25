class Solution {
    public boolean canConstruct(String a, String b) {
         HashMap<Character,Integer> set1=new HashMap<>();
         HashMap<Character,Integer> set2=new HashMap<>();
      
        for(int i=0;i<a.length();i++)
        {
            set1.put(a.charAt(i),set1.getOrDefault(a.charAt(i),0)+1);
        }
          for(int i=0;i<b.length();i++)
        {
            set2.put(b.charAt(i),set2.getOrDefault(b.charAt(i),0)+1);
        }
        for(int i=0;i<a.length();i++)
        {
            if(set2.containsKey(a.charAt(i)))
            {
                if(set2.get(a.charAt(i))>=set1.get(a.charAt(i)))
                {
                    continue;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}

class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer,Integer> map=new HashMap<>();
    int n;
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        n=nums.length;
        for(int x:nums)
        {
            map.put(x,map.getOrDefault(x,0)+1);
        }
        backtrack(new ArrayList<Integer>(),map);
        return result;
    }

    public void backtrack(ArrayList<Integer> l,Map<Integer,Integer> map) {
      if(l.size()==n)
      {
        result.add(new ArrayList<>(l));
        return ;
      }  
      for(int x:map.keySet())
      {
          if(map.get(x)>0)
          {
              l.add(x);
              map.put(x,map.get(x)-1);
              backtrack(l,map);
              map.put(x,map.get(x)+1);
              l.remove(l.size()-1);
          }
      }
    }

}
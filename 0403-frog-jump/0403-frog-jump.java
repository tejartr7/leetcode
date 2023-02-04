class Solution {
    public boolean canCross(int[] stones) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int x:stones)
        {
            map.put(x,new HashSet<Integer>());
        }
        map.get(stones[0]).add(1);
        for(int x:stones)
        {
            for(int jump:map.get(x))
            {
                if(jump!=0 && map.containsKey(jump+x))
                {
                    map.get(x+jump).add(jump-1);
                    map.get(x+jump).add(jump);
                    map.get(x+jump).add(jump+1);
                }
            }
        }
        return map.get(stones[stones.length-1]).size()>0;
    }
}
class Solution {
    public List<Integer> findLonely(int[] nums) {
        //time optimzed method
        Map<Integer,Integer> map=new HashMap<>();
        List<Integer> lonelyList=new ArrayList<>();
         if (nums == null || nums.length == 0) {
            return lonelyList;
        }
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();
            if (count == 1 && !map.containsKey(key - 1) && !map.containsKey(key + 1)) {
                lonelyList.add(key);
            }
        }
        return lonelyList;
    }
}
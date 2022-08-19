import java.util.HashMap;
import java.util.Map.Entry;
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer, Integer> map = new HashMap<>();
	for (int num : nums) {
		map.put(num, map.getOrDefault(num, 0) + 1);
	}
    PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        for(Map.Entry kk:map.entrySet())
        {
            pq.add(kk);
        }
        int i;
        int a[]=new int[k];
        for(i=0;i<k;i++)
        {
            a[i]=pq.poll().getKey();
        }
        return a;
        }
    
    
}
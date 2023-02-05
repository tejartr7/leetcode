import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public int maximizeWin(int[] p, int k) {
        if (k == 0 || k == 1)
            return 2;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : p) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        System.out.println(map);
        for (int x : map.keySet()) {
            int y = x + k;
            int temp = x;
            int count = 0;
            while (temp <= y) {
                count += map.getOrDefault(temp, 0);
                temp++;
            }
            pq.add(count);
        }
        if (pq.size() >= 2) {
            return pq.peek() + pq.peek();
        }
        return 0;
    }

    public long pickGifts(int[] gifts, int k) {
        long ans = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int x : gifts) {
            pq.offer(x);
        }
        while (k > 0) {
            if (pq.isEmpty())
                break;
            int x = (int) Math.floor(Math.sqrt((pq.poll())));
            pq.offer(x);
            k--;
        }
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }
        return ans;
    }

}
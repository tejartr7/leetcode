
class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int ans = 0;
        int i, j, n = reward1.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(i=0;i<n;i++)
            pq.offer(reward1[i]-reward2[i]);
        for(int x:reward2)
            ans+=x;
        while(k>0 && pq.size()>0)
        {
            ans+=pq.poll();
            k--;
        }
        return ans;
    }
}
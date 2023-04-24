class Solution {
    public int lastStoneWeight(int[] stones) {
        int i,n=stones.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:stones)
        {
            pq.offer(x);
        }
        while(pq.size()>1)
        {
            int x=pq.poll();
            int y=pq.poll();
            if(x!=y)
            {
                pq.offer(Math.abs(x-y));
            }
        }
        return pq.size()==1?pq.peek():0;
    }
}
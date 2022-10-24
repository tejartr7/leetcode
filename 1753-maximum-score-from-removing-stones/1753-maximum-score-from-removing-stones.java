class Solution {
    public int maximumScore(int a, int b, int c) {
        int count=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        while(pq.peek()>0)
        {
            int x=pq.peek();
            pq.remove(x);
            x--;
            int y=pq.peek();
            if(y<=0)
                break;
            pq.remove(y);
            y--;
            count++;
            pq.add(x);
            pq.add(y);
        }
        return count;
    }
}
class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<costs.length;i++)
        {
            sum+=costs[i][0];
            pq.offer(costs[i][1]-costs[i][0]);
        }
        while(pq.size()>costs.length/2)
        {
            sum+=pq.poll();
        }
        return sum;
    }
}
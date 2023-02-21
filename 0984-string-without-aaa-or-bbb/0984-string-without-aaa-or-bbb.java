class Pair {
    char x;
    int y;
    Pair(char x, int y) {
        this.x = x;
        this.y = y;
    }
}

class PairComparator implements Comparator<Pair> {
    @Override
    public int compare(Pair p1, Pair p2) {
        return p2.y - p1.y;
    }
}
class Solution {
    public String strWithout3a3b(int a, int b) {
        String ans="";
         PriorityQueue<Pair> pq = new PriorityQueue<>(new PairComparator());
        if(a>0)
            pq.offer(new Pair('a',a));
        if(b>0)
            pq.offer(new Pair('b',b));
        while(pq.size()>0)
        {
            int n=ans.length();
            Pair top=pq.poll();
            if(n>1 && ans.charAt(n-1)==ans.charAt(n-2) && ans.charAt(n-1)==top.x)
            {
                if(pq.size()==0) break;
                Pair top2=pq.poll();
                ans+=top2.x;
                top2.y--;
                if(top2.y>0)
                pq.offer(top2);
            }
            else
            {
                ans+=top.x;
                top.y--;
            }
            if(top.y>0)
                pq.offer(top);
        }
        return ans;
    }
}
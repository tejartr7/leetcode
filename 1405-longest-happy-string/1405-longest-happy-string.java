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
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>(new PairComparator());
        StringBuilder answer = new StringBuilder();
        if(a != 0) {
            maxHeap.offer(new Pair('a',a));
        }
        if(b != 0) {
            maxHeap.offer(new Pair('b',b));
        }
        if(c != 0) {
            maxHeap.offer(new Pair('c',c));
        }
        while(!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();
            int n = answer.length();
            if(n > 1 && answer.charAt(n-1) == answer.charAt(n-2) && answer.charAt(n-1) == pair.x) {
                if(maxHeap.isEmpty()) {
                    break;
                } else {
                    Pair nextPair = maxHeap.poll();
                    answer.append(nextPair.x);
                    nextPair.y--;
                    if(nextPair.y != 0) {
                        maxHeap.offer(nextPair);
                    }
                }
            } else {
                answer.append(pair.x);
                pair.y--;
            }
            if(pair.y != 0) {
                maxHeap.offer(pair);
            }
        }
        return answer.toString();
    }
}
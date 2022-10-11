import java.util.Deque;
import java.util.Queue;

class Solution {
    public int[] asteroidCollision(int[] a) {
        Deque<Integer> queue=new ArrayDeque<>();
        int i,n=a.length;
        for(i=0;i<n;i++)
        {
            if(queue.isEmpty() || a[i]>0)
                queue.offerLast(a[i]);
            else
            {
                while(!queue.isEmpty() && queue.peekLast()>0)
                {
                    if(queue.peekLast()<Math.abs(a[i]))
                    {
                        queue.pollLast();
                    }
                    else
                        break;
                }
                if(!queue.isEmpty() && queue.peekLast()==-a[i])
                    queue.pollLast();
                else if(queue.isEmpty() || queue.peekLast()<0)
                    queue.offerLast(a[i]);
            }
        }
        int arr[]=new int[queue.size()];
        i=0;
        while(!queue.isEmpty())
        {
            arr[i++]=queue.pollFirst();
        }
        return arr;
    }
}
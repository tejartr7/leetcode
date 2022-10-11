import java.util.Deque;
import java.util.Queue;

class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> stack=new Stack<>();
        int i,n=a.length;
        for(i=0;i<n;i++)
        {
            if(stack.isEmpty()||a[i]>0)
            {
                stack.push(a[i]);
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(a[i]))
                    stack.pop();
                if(!stack.isEmpty() && stack.peek()==-a[i])
                    stack.pop();
                else if(stack.isEmpty() || stack.peek()<0)
                    stack.push(a[i]);
            }
        }
        int arr[]=new int[stack.size()];
        i=stack.size()-1;
        while(!stack.isEmpty())
        {
            arr[i--]=stack.pop();
        }
        return arr;
    }
}
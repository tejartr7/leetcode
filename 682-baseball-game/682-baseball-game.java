class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> a=new Stack<>();
        int l=ops.length;
        int i;
        for(i=0;i<l;i++)
        {
            String k=ops[i];
            if(k.equals("+"))
            {
                int r=a.pop();
                int t=r+a.peek();
                a.push(r);
                a.push(t);
            }
            else if(k.equals("D"))
            {
                a.push(2*a.peek());
            }
            else if(k.equals("C"))
                a.pop();
            else
                a.push(Integer.valueOf(k));
        }
        int sum=0;
        while(!a.isEmpty())
            sum+=a.pop();
        return sum;
    }
}
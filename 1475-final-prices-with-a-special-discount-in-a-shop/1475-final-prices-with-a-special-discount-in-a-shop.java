class Solution {
    public int[] finalPrices(int[] p) {
        Stack<Integer> a=new Stack<>();
        int l=p.length;
        int i;
        for(i=0;i<l;i++)
        {
           while(!a.isEmpty() && p[a.peek()]>=p[i])
           {
               p[a.peek()]-=p[i];
               a.pop();
           }
            a.push(i);
        }
        
        return p;
    }
}
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int l=temperatures.length;
        int i,j;
        int []a=new int[l];
     Stack<Integer> b=new Stack<>();
        for(i=0;i<l;i++)
        {
         j=temperatures[i];
            while(!b.empty() && temperatures[b.peek()]<j)
            {
                int k=b.pop();
                a[k]=i-k;
            }
            b.push(i);
        }
        return a;
    }
}
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> minStack=new Stack<>();
        int i,n=prices.length;
        for(i=n-1;i>=0;i--)
        {
            if(minStack.isEmpty())
            {
               minStack.push(prices[i]);
            }
            else
            {
                while(!minStack.isEmpty() && minStack.peek()>prices[i])
                {
                    minStack.pop();
                }
                int k=prices[i];
                if(!minStack.isEmpty())
                {
                    prices[i]-=minStack.peek();
                }
                minStack.push(k);
            }
        }
        return prices;
    }
}
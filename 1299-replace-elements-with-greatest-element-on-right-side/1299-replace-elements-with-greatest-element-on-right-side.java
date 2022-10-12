class Solution {
    public int[] replaceElements(int[] arr) {
     Stack<Integer> stack=new Stack<>();
        int i,n=arr.length;
        int ans[]=new int[n];
        for(i=n-1;i>=0;i--)
        {
            if(stack.isEmpty())
             {
             ans[i]=-1;
             stack.push(arr[i]);
            }
            else if(!stack.isEmpty())
            {   
               if(arr[i]<stack.peek())
               {
                   ans[i]=stack.peek();
               }
                else
                {
                    ans[i]=stack.peek();
                    stack.push(arr[i]);
                }
                   
            }
        }
        return ans;
    }
}
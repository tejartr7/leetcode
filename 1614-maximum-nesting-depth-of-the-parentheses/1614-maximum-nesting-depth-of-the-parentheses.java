class Solution {
    public int maxDepth(String s) {
        Stack<Character> a=new Stack<>();
        int i,n=s.length();
        int max=Integer.MIN_VALUE;
        int count=0;
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {a.push(ch);
            count++;}
            else if(ch==')')
            {
                while(!a.isEmpty() && a.peek()!='(')
                {
                    a.pop();
                    
                }
                a.pop();
                count--;}
            else
                a.push(ch);
            max=Math.max(max,count);
        }
        return max;
    }
}
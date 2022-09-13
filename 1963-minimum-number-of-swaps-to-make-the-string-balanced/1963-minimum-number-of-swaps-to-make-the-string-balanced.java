class Solution {
    public int minSwaps(String s) {
        Stack<Character> a=new Stack<>();
        int i,n=s.length();
        if(n%2==1)
            return -1;
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==']')
            {
                if(!a.isEmpty() && a.peek()=='[')
                    a.pop();
                else
                    a.push(ch);
            }
            else
                a.push(ch);
        }
        int x=0;int y=0;
        while(!a.isEmpty())
        {
            char ch=a.pop();
            if(ch=='[')
            {
                x++;
            }
            else
                y++;
        }
        return (x+y+2)/4;
    }
}
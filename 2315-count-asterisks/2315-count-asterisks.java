class Solution {
    public int countAsterisks(String s) {
        Stack<Character> a=new Stack<>();
        int i,n=s.length();
        int k=0;
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch=='|')
            {
                if(!a.isEmpty() && k%2==1)
                {
                    while(a.peek()!='|')
                        a.pop();
                    a.pop();
                    k--;
                }
                else 
                {
                    a.push(ch);
                    k++;
                }
            }
            else
                a.push(ch);
            
        }
        int count=0;
        while(!a.isEmpty())
        {
            char c=a.pop();
            if(c=='*')
                count++;
        }
        return count;
    }
}
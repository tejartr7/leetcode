class Solution {
    public int minSwaps(String s) {
      Stack<Character> a=new Stack<>();
        int i,n=s.length();
          int x=0;int y=0;
        if(n%2==1)
            return -1;
        for(i=0;i<n;i++)
        {
            char ch=s.charAt(i);
            if(ch==']')
            {
                if(!a.isEmpty() && a.peek()=='[')
                {a.pop();
                x--;}
                else
                {a.push(ch);
                y++;}
            }
            else
            {a.push(ch);
            x++;}
        }
      
       
        return (x+y+2)/4;
    }
}
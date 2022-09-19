class Solution {
   public String decodeString(String s) {
        Stack<Character> ans = new Stack<>();
        int i;
        for(char c : s.toCharArray()){
            char ch=c;
         
          if(ch==']')
          {   StringBuilder a=new StringBuilder();
              String temp=new String();
              int k;
              while(!ans.isEmpty())
              {
                  char chh=ans.pop();
                  if(chh=='[')
                      break;
                  a.append(chh);
              }
              while(!ans.isEmpty() && Character.isDigit(ans.peek()))
              {
                 temp=ans.pop()+temp; 
              }
               k = Integer.parseInt(temp);
              while(k>0)
              {   for(i=a.length()-1;i>=0;i--)
              {
                  ans.push(a.charAt(i));
              }
                  k--;
              }
          }
            else
                ans.push(c);
           
        }
       String res="";
       while(!ans.isEmpty())
       {
           res=String.valueOf(ans.pop())+res;
       }
       return res;
   }
}
class Solution {
   public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){

            // Step2:if char == ']',start to find the (1)subStr;(2)k due to the formation of k[subStr]
            if(c == ']'){
                StringBuilder subStr = new StringBuilder();
                String temp = new String();
                int k;
                //Step2-1:find the (1)subStr and remove the '[' in the stack
                while(!stack.isEmpty() && stack.peek() != '['){
                    subStr.append(stack.pop());
                }
                stack.pop();

                //Step2-2:find the (2)k and remove the k in the stack. k is in range [1,300]
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    temp = stack.pop() + temp;
                }
                k = Integer.parseInt(temp);

                //Step2-3:push the subStr into the stack
                while(k-- > 0){
                    for(int i = subStr.length() - 1;i >= 0;i--){
                        stack.push(subStr.charAt(i));
                    }
                }
            }else{
                // Step1:put the char into the stack, except ']'
                stack.push(c);
            }
        }

        //Step3:reverse the stack
        char[] result = new char[stack.size()];
        int i = stack.size() - 1;
        while(!stack.isEmpty()){
            result[i--] = stack.pop();
        }
        return new String(result);
   }
}
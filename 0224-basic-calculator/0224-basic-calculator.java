import java.text.CharacterIterator;
import java.util.Stack;

class Solution {
	 public int calculate(String s) {
        int n = s.length();
        int ans = 0, sum = 0, sign = 1;
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0; i<n; i++){
            if(Character.isDigit(s.charAt(i))){
                sum = s.charAt(i) - '0';
                while(i+1<n && Character.isDigit(s.charAt(i+1))){
                    sum = sum*10 + s.charAt(i+1)-'0';
                    i++;
                }
                ans += sum*sign;
                sum = 0;
                sign = 1;
            }
            else if(s.charAt(i) == '+') sign = 1;
            else if(s.charAt(i) == '-') sign = -1;
            else if(s.charAt(i) == '('){
                st.push(ans);
                st.push(sign);
                ans = 0;
                sign = 1;
            }
            else if(s.charAt(i) == ')'){
                int prevSign = st.pop();
                int prevSum = st.pop();
                ans = ans*prevSign + prevSum;
            }
        }
        return ans;
     }
}
class Solution {
    public int minSwaps(String s) {
 Stack<Character>st = new Stack<>();
    
    
    for(int i = 0; i<s.length(); i++){
        if(s.charAt(i) == '['){
            st.push('[');
        }
        else if(st.size() > 0 && st.peek() == '[' && s.charAt(i) == ']'){
            st.pop();
        }
      
    }
    
    return (st.size()+1)/2;
    }
}
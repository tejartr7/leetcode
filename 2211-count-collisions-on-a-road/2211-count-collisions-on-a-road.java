class Solution {
    public int countCollisions(String directions) {
        
        int collisions = 0;
        Stack<Character> stack = new Stack();
        stack.push(directions.charAt(0));
        for(int i = 1;i<directions.length();i++){
            char curr = directions.charAt(i);
            if((stack.peek()== 'R' && curr == 'L')  ){
                collisions+=2;
                stack.pop();
                curr = 'S';
     

            }else if((stack.peek() == 'S' && curr == 'L')){
                curr = 'S';
                collisions+=1;
            }
            while(!stack.isEmpty() && ((stack.peek() == 'R' && curr == 'S') )){
              collisions+=1;
              stack.pop();
            }
            
            stack.push(curr);
        }
        
        return collisions;
    }
}
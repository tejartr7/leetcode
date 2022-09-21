class Solution {
    public boolean queryString(String s, int n) {
        Queue<String> x=new LinkedList<>();
        //add 1 intially to the queue
        x.add("1");
        while(n>0)
        {   //remove the first element from the queue
            String temp=x.remove();
            //if s doesnt have the value of the front element pop
            if(!s.contains(temp))
                return false;
            //then add 0 to temp and then add temp to x 
            // similary add 1 to tempa nd add temp to x
            x.add(temp+"0");
            x.add(temp+"1");
            n--;
        }
        return true;
    }
}
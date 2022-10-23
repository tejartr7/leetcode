class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
         int x=event2[0].compareTo(event1[1]);
         int y=event2[1].compareTo(event1[0]);
         if(x<=0 && y>=0)
            return true;
         return false;
    }
}
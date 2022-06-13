import java.util.*;
class Solution {
    public int strStr(String haystack,String needle) {
       String p=haystack;
        String q=needle;
        if(p.contains(q))
        {
      return p.indexOf(q);
        }
        
        return -1;
    }
}
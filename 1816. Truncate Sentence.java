class Solution {
    public String truncateSentence(String s, int k) {
        int count=0;
        int i=0;
        int index=0;
        while(i<s.length())
        {
            if(s.charAt(i)==' ')
                count++;
            
          
            if(count==k)
                break;
              index++;
            i++;
        }
        String o=s.substring(0,index);
        return o;
    }
}

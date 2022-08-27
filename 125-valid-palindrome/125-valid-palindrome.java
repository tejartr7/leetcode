class Solution {
    public boolean isPalindrome(String s) {
     String k=s.toLowerCase();
        String p=k.replaceAll("\\s","");
         p=p.replaceAll(",","");
         p=p.replaceAll(":","");
         int start=0;
        int end=p.length()-1;
        while(start<=end)
        {
            int kk=(int)p.charAt(start);
            int k1=(int)p.charAt(end);
            if(!Character.isLetterOrDigit(p.charAt(start)))
                start++;
           else if(!Character.isLetterOrDigit(p.charAt(end)))
                end--;
            else{
           if(p.charAt(start)!=p.charAt(end))
                return false;
            start++;
            end--;
            }
        }
        return true;
    }
}
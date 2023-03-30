class Solution {
  public int longestBeautifulSubstring(String word) {
        int cnt=1;
        int len=1;
        int max_length=0;
        
        int n=word.length();
        
        for(int i=1;i<n;i++){
            if(word.charAt(i)==word.charAt(i-1)){
                 len++;
            }else if(word.charAt(i-1)<word.charAt(i)){
                cnt++;
                len++;
            }else{
                len=1;
                cnt=1;
            }
            
            if(cnt==5){
                max_length=Math.max(max_length,len);
            }
        }
        return max_length;
    }
}
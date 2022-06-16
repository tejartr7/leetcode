class Solution {
    public int mostWordsFound(String[] sentences) {
      int k=sentences.length;
       int max=0;
        
        for(int i=0;i<k;i++)
        {
            String []a=sentences[i].split(" ");
            max=Math.max(a.length,max);
        }
        return max;
        
        
        }
    
}
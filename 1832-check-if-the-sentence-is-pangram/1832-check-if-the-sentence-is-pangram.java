class Solution {
    public boolean checkIfPangram(String sentence) {
      if(sentence.length()<26) return false;

        for (int i=0;i<26;i++){
            if(!sentence.contains(Character.toString(i+97))) return false;
        }
        return true;
    }
}
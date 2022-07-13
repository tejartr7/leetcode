class Solution {
    public boolean canConstruct(String s, String t) {
     HashMap<Character, Integer> hm1 = new HashMap<>(); //will contain character frequency of t or magazine
        HashMap<Character, Integer> hm2 = new HashMap<>(); //will contain character frequency of s or ransomnote
        for(int i =0; i<t.length(); i++){
            hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i),0)+1);  //storing frequency of magazine
        }
        
        for(int i =0; i<s.length(); i++){
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i),0)+1); //storing frequency of ransomnote
        }
        for(int i = 0; i<s.length(); i++){
            if(hm2.containsKey(s.charAt(i))){  // if magazine contains the character in ransomnote or not
                if(hm2.get(s.charAt(i))>=hm1.get(s.charAt(i))) continue; //if yes then does magazine has  
				//enough freq for that character  that ransomnote requires
                else return false; // if magazine does not have enough freq for that character return false
            }
            else return false; // if magazine does not have character that ransomnote has
        }
        return true; 
    }
}
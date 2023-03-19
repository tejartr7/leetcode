class trie
{
    trie children[]=new trie[26];
    boolean end=false;
}
class WordDictionary {
    trie root=new trie();
    public WordDictionary() {
        
    }
    
    public void addWord(String word) {
        trie curr=root;
        for(int i=0;i<word.length();i++)
        {
            int x=word.charAt(i)-'a';
            if(curr.children[x]==null)
            {
                curr.children[x]=new trie();
            }
            curr=curr.children[x];
        }
        curr.end=true;
    }
    public boolean searching(String word, trie node, int wordIdx) {
    if (node == null) return false;
    /**
     * Time Complexity: O(n)
     *   - word length
     */
    for (int i = wordIdx; i < word.length(); i++) {
      int idx = word.charAt(i) - 'a';
      // ('.' - 'a') = -51
      if (idx == (-51)) {
        /**
         * Time Complexity: O(1)
         *   - Always 26 lower-case English letters
         */
        for (int j = 0; j < node.children.length; j++) {
          /**
           * Space Complexity: O(n)
           *   - stack: if search '.' for whole letters.
           */
          if (searching(word, node.children[j], i + 1)) {
            return true;
          }
        }
        return false;
      }
      if (node.children[idx] == null) return false;
      node = node.children[idx];
    }
    return node.end;
  }

  public boolean search(String word) {
    return searching(word, root, 0);
  }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
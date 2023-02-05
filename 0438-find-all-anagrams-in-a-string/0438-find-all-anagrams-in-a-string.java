class Solution {
    public boolean matches(int[] s1map, int[] s2map) {
        for (int i = 0; i < 26; i++) {
            if (s1map[i] != s2map[i])
                return false;
        }
        return true;
    }
    public List<Integer> findAnagrams(String s2, String s1) {
        List<Integer> list=new ArrayList<>();
        int i,j;
        int[] s1map = new int[26];
        for (i = 0; i < s1.length(); i++)
            s1map[s1.charAt(i) - 'a']++;
        for (i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2map = new int[26];
            for (j = 0; j < s1.length(); j++) {
                s2map[s2.charAt(i + j) - 'a']++;
            }
            if (matches(s1map, s2map))
            {
                list.add(i);
            }
        }
        return list;
    }
}
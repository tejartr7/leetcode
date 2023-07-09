class Solution {
    public int largestVariance(String s) {
        int output = 0;
        int[][] dif = new int[26][26];
        int[][] difB = new int [26][26];
        for(int i = 0; i < 26; i++){
            Arrays.fill(difB[i], -s.length());
        }

        for(int j = 0; j < s.length(); j++){
            int ch = s.charAt(j) - 'a';
            for(int k = 0; k < 26; k++){
                if(k == ch) continue;
                ++dif[ch][k];
                ++difB[ch][k];
                difB[k][ch] = --dif[k][ch];
                dif[k][ch] = Math.max(dif[k][ch], 0);
                output = Math.max(output, Math.max(difB[ch][k], difB[k][ch]));

            }
        }
        return output;
    }
}
class Solution {
    Integer memo[][];

    public int minDistance(String word1, String word2) {
        memo = new Integer[word1.length() + 1][word2.length() + 1];
        return minDistanceRecur(word1, word2, word1.length(), word2.length());
    }

    int minDistanceRecur(String word1, String word2, int word1Index, int word2Index) {
        if (word1Index == 0) {
            return word2Index;
        }
        if (word2Index == 0) {
            return word1Index;
        }
        if (memo[word1Index][word2Index] != null) {
            return memo[word1Index][word2Index];
        }
        int minEditDistance = 0;
        if (word1.charAt(word1Index - 1) == word2.charAt(word2Index - 1)) {
            minEditDistance = minDistanceRecur(word1, word2, word1Index - 1, word2Index - 1);
        }
        else {
            int insertOperation = minDistanceRecur(word1, word2, word1Index, word2Index - 1);
            int deleteOperation = minDistanceRecur(word1, word2, word1Index - 1, word2Index);
            int replaceOperation = minDistanceRecur(word1, word2, word1Index - 1, word2Index - 1);
            minEditDistance = Math.min(insertOperation, Math.min(deleteOperation, replaceOperation)) + 1;
        }
        memo[word1Index][word2Index] = minEditDistance;
        return minEditDistance;
    }
}
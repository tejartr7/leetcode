class Solution {
    public int[] numberOfPairs(int[] nums) {
  int cnt[]= new int[101];
    for(int i:nums) cnt[i]++;
    int pairs=0, leftover=0;
    for(int i:cnt){
        pairs+= i/2;
        
    }
        leftover=nums.length-(2*pairs);
    return new int[]{pairs,leftover};
    }
}
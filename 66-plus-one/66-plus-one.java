class Solution {
    public int[] plusOne(int[] digits) {
       for (int i = digits.length - 1; i >=0; i--) {
        if (digits[i] != 9) {
            digits[i]++;
            break;
        } else {
            digits[i] = 0;
        }
    }
    if (digits[0] == 0) {
        int l=digits.length+1;
        int[] res = new int[l];
        res[0] = 1;
        return res;
    }
    return digits;
    }
}
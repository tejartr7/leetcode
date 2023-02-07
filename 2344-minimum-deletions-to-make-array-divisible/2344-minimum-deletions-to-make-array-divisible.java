class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(numsDivide);
        int val=numsDivide[0];
        for(int i=1;i<numsDivide.length;i++){
            val=gcd(val,numsDivide[i]);
        }
        Arrays.sort(nums);
        int c=0;
        if(nums[0]>val) return -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>val) break;
            if(val%nums[i]!=0) c++;
            else break;
        }
        if(c==nums.length) return -1;
        return c;
    }

    static int gcd(int a, int b){
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
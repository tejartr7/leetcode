class Solution {
    public String largestNumber(int[] nums) {
        int i,n=nums.length;
        String temp[]=new String[n];
        for(i=0;i<n;i++)
        {
            temp[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(temp,(a,b)->(b+a).compareTo(a+b));
        String ans="";
        for(String x:temp)
            ans+=x;
        if (temp[0].equals("0")) {
            return "0";
        }
        return ans;
    }
}
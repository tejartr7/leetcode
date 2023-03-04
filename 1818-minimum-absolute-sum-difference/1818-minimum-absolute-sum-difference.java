

class Solution {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
        int len=nums1.length, mod=1000000007;
        int diff[]=new int[len];
        long sum=0,ans=0;
        for(int i=0;i<len;i++){
            diff[i]=Math.abs(nums1[i]-nums2[i]);
            sum+=diff[i];
        }
        ans=sum;
        Arrays.sort(nums1);
        for(int i=0;i<len;i++){
            sum-=diff[i];
            int val=helper(nums1,nums2[i]);
            sum+=val;
            if(sum<ans){
             ans=sum;
            }
            sum-=val;
            sum+=diff[i];
        }
        return (int)(ans%mod);
    }

    public int helper(int[] nums, int target) {
        int l = 0, h = nums.length - 1;
        int small = -1, big = -1;
        int ans = Integer.MAX_VALUE;
        int mod = 1000_000_007;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (nums[mid] == target)
                return 0;
            else if (nums[mid] < target) {
                small = nums[mid];
                l = mid + 1;
            } else {
                big = nums[mid];
                h = mid - 1;
            }
        }
        if (small != -1)
            ans = Math.min(Math.abs(target - small), ans);
        if (big != -1)
            ans = Math.min(ans, Math.abs(target - big));
        return ans;
    }
}
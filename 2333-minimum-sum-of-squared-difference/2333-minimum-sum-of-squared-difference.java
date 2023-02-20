class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        long ans = 0;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        int i,n=nums1.length;
        for(i=0;i<n;i++)
        {
            int diff=Math.abs(nums1[i]-nums2[i]);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        int k=k1+k2;
        while(k>0)
        {
            int largest=map.lastKey();
            if(largest==0) return 0;
            int mini=Math.min(k,map.get(largest));
            map.put(largest-1,map.getOrDefault(largest-1,0)+mini);
            k-=mini;
            map.put(largest,map.get(largest)-mini);
            if(map.get(largest)==0)
                map.remove(largest);
        }
        for(int key:map.keySet())
        {
            long x=key;
            long y=map.get(key);
            ans+=x*x*y;
        }
        return ans;
    }
}
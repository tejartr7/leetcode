class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int ans=0;
        int mod=1000_000_007;
        int i;
        for(i=1;i<=high;i++)
        {
            int p=map.getOrDefault(i-zero,0);
            int q=map.getOrDefault(i-one,0);
            int cnt=(p+q)%mod;
            map.put(i,cnt);
        }
       // System.out.println(map);
        for(i=low;i<=high;i++)
        {
            ans=(ans%mod+map.get(i)%mod)%mod;
        }
        return ans%mod;
    }
}
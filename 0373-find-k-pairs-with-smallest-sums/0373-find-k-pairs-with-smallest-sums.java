class pair
{
    int sum;
    int idx;
    pair(int a,int b)
    {
        sum=a;
        idx=b;
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res=new ArrayList<>();
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.sum-b.sum);
        int i,j,m=nums1.length,n=nums2.length;
        for(int x:nums1)
            pq.offer(new pair(x+nums2[0],0));
        while(!pq.isEmpty() && k>0)
        {
            pair top=pq.poll();
            int sum=top.sum;
            int idx=top.idx;
            List<Integer> temp=new ArrayList<>();
            temp.add(sum-nums2[idx]);
            temp.add(nums2[idx]);
            res.add(temp);
            if(idx+1<n)
            {
                pq.offer(new pair(sum-nums2[idx]+nums2[idx+1],idx+1));
            }
            k--;
        }
        return res; 
    }
}
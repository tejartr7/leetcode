
class Solution {
    public int minimumSeconds(List<Integer> nums) {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        int i,j,n=nums.size();
        List<Integer>list=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            if(!map.containsKey(nums.get(i)))
            {
                map.put(nums.get(i),new ArrayList<>());
            }
            map.get(nums.get(i)).add(i);
        }
        int ans=n;
        for(int x:map.keySet())
        {
            ArrayList<Integer> temp=map.get(x);
            temp.add(temp.get(0)+n);
            int maxi=0;
            for(i=1;i<temp.size();i++)
            {
                maxi=Math.max(maxi,temp.get(i)-temp.get(i-1));
            }
            //maxi=maxi%2==1?maxi/2+1:maxi;
            ans=Math.min(ans,maxi/2);
        }
        return ans;
    }
}

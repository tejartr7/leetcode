class Solution {
    public long findScore(int[] nums) {
        long sum=0;
        int i,n=nums.length;
        TreeMap<Integer,TreeSet<Integer>> map=new TreeMap<>();
        for(i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
                map.put(nums[i],new TreeSet<>());
            map.get(nums[i]).add(i);
        }
        while(map.size()>0)
        {
            int x=map.firstKey();
            sum+=x;
            int ind=map.get(x).first();
            map.get(x).remove(ind);
            if(map.get(x).size()==0)
                map.remove(x);
            if(ind-1>=0)
            {
                //int temp=map.get(nums[ind]-1).first();
                if(map.containsKey(nums[ind-1])){
                map.get(nums[ind-1]).remove(ind-1);
                if(map.get(nums[ind-1]).size()==0)
                    map.remove(nums[ind-1]);
                }
            }
            if(ind+1<n)
            {
                if(map.containsKey(nums[ind+1])){
                map.get(nums[ind+1]).remove(ind+1);
                if(map.get(nums[ind+1]).size()==0)
                    map.remove(nums[ind+1]);
                }
            }
        }
        return sum;
    }
}
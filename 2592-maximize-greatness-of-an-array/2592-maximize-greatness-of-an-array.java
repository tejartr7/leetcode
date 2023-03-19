

class Solution {
    public int helper(TreeMap<Integer,Integer> map,int x)
    {
        int k=map.get(x)==null?-1:map.get(x);
        if(map.containsKey(x))
        map.remove(x);
        int a=map.ceilingKey(x)==null?-1:map.ceilingKey(x);
        if(map.size()==0)
        {
            if(k!=-1)
            map.put(x,k-1);
            if(map.containsKey(x) && map.get(x)==0)
                map.remove(x);
            return x;
        }
        int b=map.firstKey();
        if(a!=-1)
        {
            int dummy=a;
            map.put(a,map.getOrDefault(a,0)-1);
            if(map.containsKey(a) && map.get(a)==0)
                map.remove(a);
            if(k!=-1)
            map.put(x,k);
            return dummy;
        }
        map.put(b,map.getOrDefault(b,0)-1);
        if(map.get(b)==0) map.remove(b);
        return b;
    }
    public int maximizeGreatness(int[] nums) {
        TreeMap<Integer,Integer> tm=new TreeMap<>();
        int count=0;
        int i,n=nums.length;
        for(i=0;i<n;i++)
        {
            tm.put(nums[i],tm.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[n];
        //System.out.println(n+" "+tm.size());
        int max=0;
        for(int x:tm.keySet())
            max=Math.max(max,tm.get(x));
        return n-max;
    }
}
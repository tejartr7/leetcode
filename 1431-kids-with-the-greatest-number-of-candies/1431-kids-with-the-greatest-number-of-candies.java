class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> a=new ArrayList<Boolean>();
        int max=0;
        int i;
        int l=candies.length;
        for(i=0;i<l;i++)
        {
            max=Math.max(max,candies[i]);
        }
        for(i=0;i<l;i++)
        {
            if(extraCandies+candies[i]>=max)
                a.add(true);
            else
                a.add(false);
        }
        return a;
    }
}
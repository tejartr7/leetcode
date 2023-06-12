class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        int i,j,n=nums.length;
        i=0;
        j=0;
        while(j<n)
        {
            while(j<n && nums[j]-nums[i]==j-i)
            {
                j++;
            }
           // System.out.println(j);
            if(j==i+1)
            {
                String temp="";
                temp+=nums[i];
                list.add(temp);
            }
            else
            {
                String temp="";
                temp+=nums[i];
                temp+="->";
                temp+=nums[j-1];
                list.add(temp);
            }
            i=j;
        }
        return list;
    }
}
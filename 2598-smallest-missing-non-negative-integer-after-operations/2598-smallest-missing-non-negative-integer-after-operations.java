class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int count[]=new int[value];
        int start=0;
        for(int x:nums)
        {
            count[(x%value+value)%value]++;
        }
        for(int i=0;i<value;i++)
        {
            //System.out.print(count[i]+" ");
            if(count[i]<count[start])
            {
                start=i;
            }
        }
        return value*count[start]+start;
    }
}
class Solution {
    public List<Integer> addToArrayForm(int[] nums, int k) {
        LinkedList<Integer> list=new LinkedList<>();
        int i,n=nums.length;
        int carry=0;
        i=n-1;
        while(i>=0 || carry>0 || k>0)
        {
            int x=k%10;
            int y=x+carry;
            if(i>=0) y+=nums[i];
            carry=y/10;
            y=y%10;
            list.addFirst(y);
            k/=10;
            i--;
        }
        return list;
    }
}
class Solution {
    public int alternateDigitSum(int n) {
        int sum=0;
        boolean x=false;
        int i;
        LinkedList<Integer> list=new LinkedList<>();
        while(n>0)
        {
            list.addFirst(n%10);
            n=n/10;
        }
        //System.out.println(list);
        for(i=0;i<list.size();i++)
        {
            if(i%2==0)
            {
                sum+=list.get(i);
            }
            else
            {
                sum-=list.get(i);
            }
        }
        return sum;
    }
}
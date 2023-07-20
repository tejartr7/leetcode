class Solution {
    Set<Integer> set=new HashSet<>();
    public boolean isHappy(int n) {
        if(n==2||set.contains(n))
            return false;
        if(n==1  || n==100 ||n==19 ) return true;
        set.add(n);
        int sum=0;
        while(n>0)
        {
            int r=n%10;
            sum+=r*r;
            n/=10;
        }
        return isHappy(sum);
    }
}
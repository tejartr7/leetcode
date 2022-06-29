class Solution {
    public List<String> buildArray(int[] target, int n) {
        int index=0;
        int start=1;
        
        List<String> a=new ArrayList<>();
       int l=target.length;
       while(index<l && start<=n)
       {
           a.add("Push");
           if(target[index]==start)
               index++;
           else
               a.add("Pop");
           start++;
           
       }
        return a;
    }
}
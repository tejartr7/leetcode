class Solution {
    public List fizzBuzz(int n) {
       List<String> a=new ArrayList<>();
       int i=1;
        while(i<=n)
        {
            if(i%15==0)
            {
                a.add("FizzBuzz");
            }
            else if(i%3==0)
            {
                a.add("Fizz");
            }
            else if(i%5==0)
            {
                a.add("Buzz");
            }
            else
            {
                a.add(String.valueOf(i));
            }
            i++;
        }
        return a;
    }
}
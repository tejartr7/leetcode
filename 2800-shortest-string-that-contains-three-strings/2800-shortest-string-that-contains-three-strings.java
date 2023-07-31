class Solution {
    public String add(String a, String b) {
         int i,j,n=b.length();
        if(a.equals(b) || a.endsWith(b) || a.contains(b))
            return a;
        if(b.contains(a) || b.endsWith(a) || b.startsWith(a))
            return b;
        for(i=b.length();i>=0;i--)
        {
            String y=b.substring(0,i);
            if(a.endsWith(y))
            {
                return a+b.substring(i);
            }
        }
        return a+b;
    }

    public String minimumString(String a, String b, String c) {
        int maxLen = a.length() + b.length() + c.length();
        String ans = "z".repeat(1000); 
        List<String> list=new ArrayList<>();
        String x = add(a, b);
        String y = add(x, c);
        list.add(y);
        y = add(c,x);
        list.add(y);
        
        x = add(a, c);
        y = add(x, b);
        list.add(y);
        y = add(b,x);
        list.add(y);
        
        x = add(b, a);
        y = add(x, c);
        list.add(y);
        y = add(c,x);
        list.add(y);
        
        x = add(b, c);
        y = add(x, a);
        list.add(y);
        y = add(a,x);
        list.add(y);
        
        x = add(c, a);
        y = add(x, b);
        list.add(y);
        y = add(b,x);
        list.add(y);
        
        x = add(c, b);
        y = add(x, a);
        list.add(y);
        y = add(a,x);
        list.add(y);
       // System.out.println(list);
for (String xx : list) {
    String temp = xx.replaceAll(" ", "");
    if (temp.length() < ans.length() || (temp.length() == ans.length() && temp.compareTo(ans) < 0)) {
        ans = temp;
    }
}


       return ans;
        
    }
}

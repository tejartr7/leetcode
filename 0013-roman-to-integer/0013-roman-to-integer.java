class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int val=0;
        int i,n=s.length();
        char prev=' ';
        for(i=n-1;i>=0;i--)
        {
            if(i<n-1)
            {
             if(map.get(s.charAt(i))<map.get(prev))
             {
                 val-=map.get(s.charAt(i));
             }
             else val+=map.get(s.charAt(i));
            }
            else 
            {
                val+=map.get(s.charAt(i));
            }
            prev=s.charAt(i);
        }
        return val;
    }
}
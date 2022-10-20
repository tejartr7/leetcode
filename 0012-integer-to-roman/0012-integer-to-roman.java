import java.util.HashMap;
import java.util.Map;
class Solution {
    public String roman(int num)
    {   Map<Integer,String> map=new HashMap<>();
        String temp="";
        map.put(1,"I");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(40,"XL");
        map.put(49,"XLIX");
        map.put(50,"L");
        map.put(90,"XC");
        map.put(99,"XCIX");
        map.put(100,"C");
        map.put(400,"CD");
        map.put(499,"CDXCIX");
        map.put(500,"D");
        map.put(900,"CM");
        map.put(999,"CMXCIX");
        map.put(1000,"M");
        if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>1000)
        {
            num-=1000;
            temp+="M";
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>900)
        {
            num-=900;
            temp+=roman(900);
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>500)
        {
            temp+=roman(500);
            num-=500;
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
      while(num>400)
        {
            temp+=roman(400);
            num-=400;
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>100)
        {
            temp+=roman(100);
            num-=100;
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>90)
        {
            num-=90;
            temp+=roman(90);
        }
        while(num>50)
        {
            temp+=roman(50);
            num-=50;
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
      while(num>40)
        {
            temp+=roman(40);
            num-=40;
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>10)
        {
            temp+=roman(10);
            num-=10;
        }
     if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num>5)
        {
            temp+=roman(5);
            num-=5;
        }
        if(map.containsKey(num))
        {
            temp+=map.get(num);
            return temp;
        }
        while(num<4 && num>0)
        {
            temp+=roman(1);
            num-=1;
        }
        return temp;
    }
    public String intToRoman(int num) {
        String temp="";
        int count=0;
        int rev=0;
        temp=roman(num);
        return temp;
    }
}
class Solution {
    public String decodeMessage(String key, String message) {
        String k=key.replaceAll(" ","");
        Map<Character,Character> a=new HashMap<>();
       
        int i,n=k.length();
           key = key.replaceAll(" ", "");
     
        char original = 'a';
        for (i = 0; i < key.length() ; i++) {
            if (!a.containsKey(key.charAt(i))){
                a.put(key.charAt(i),original++);
            }
        }
       // System.out.println(a.get('t'));
        int n2=message.length();
        String y="";
        for(i=0;i<n2;i++)
        {
            if(!a.containsKey(message.charAt(i)))
                y+=String.valueOf(message.charAt(i));
            else
            {
                y+=String.valueOf(a.get(message.charAt(i)));
            }
        }
        return y;
    }
}
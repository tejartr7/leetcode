class Solution {
    public String reversePrefix(String word, char ch) {
        char a[]=word.toCharArray();
        int count=0;
        int i;
        for(i=0;i<word.length();i++)
        {
            if(a[i]==ch)
            {count=i;
             break;
            }
        }
        int start=0;
        int end=count;
        while(start<=end)
        {
            char temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
        return String.valueOf(a);
    }
}
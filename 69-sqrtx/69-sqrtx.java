import java.util.*;
class Solution {
    public int mySqrt(int x) {
        if(x==0)
            return 0;
        if(x<4)
            return 1;
        int l=1;
        int h=x;
         while(h-l>=0)
        {
            int mid=l+(h-l)/2;
             if(x/mid==mid)
                 return mid;
             else if(x/mid<mid)
             {
                 h=mid-1;
             }
             else
                 l=mid+1;
        }
        return l-1;
    }
}
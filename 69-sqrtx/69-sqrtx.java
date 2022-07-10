import java.util.*;
class Solution {
    public int mySqrt(int x) {
     int l=1;
        int h=x;
        if(x==0)
            return 0;
        if(x<4)
            return 1;
        while(l<h)
        {
            int mid=l+(h-l)/2;
            if(x/mid==mid)
                return mid;
            else if(x/mid>mid)
                l=mid+1;
            else 
                h=mid;
        }
        return l-1;
    }
}
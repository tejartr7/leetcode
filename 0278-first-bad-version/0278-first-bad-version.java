/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
int pos=0,mid,first,last;
        first=1;
        last=n;
        while(first<=last)
        {mid=first+(last-first)/2;
            boolean x=isBadVersion(mid);
         if(x==true)
         { last=mid-1;
         pos=mid;
         }
         else
             first=mid+1;
         
         
        }
        return pos;
    }
}
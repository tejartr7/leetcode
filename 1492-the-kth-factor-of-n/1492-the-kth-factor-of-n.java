import java.io.*;
import java.util.*;
class Solution {
    public int kthFactor(int n, int k) {
      //  Set<Integer> a=new HashSet<Integer>();
        int i;
        int s=0;
        int count=0;
        for(i=1;i<=n;i++)
        {if(n%i==0)
        {
         count++;
         if(count==k)
           return i;
        }
        }
        return -1;
    }
}
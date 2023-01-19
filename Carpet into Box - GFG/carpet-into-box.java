//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int A =sc.nextInt();
            int B =sc.nextInt();
            int C =sc.nextInt();
            int D =sc.nextInt();
             
           System.out.println(new Solution().carpetBox(A,B,C,D)); 
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution{
    int carpetBox(int a, int b, int c, int d) { 
        //code here
        int count=0;
        int x=Math.min(c,d);
        int y=Math.max(c,d);
        int p=Math.min(a,b);
        int q=Math.max(a,b);
        while(y<q)
        {
        count++;
        q=q/2;
        int m=Math.min(q,p);
        int n=Math.max(q,p);
        q=n;
        p=m;
        }
        //System.out.println(p);
        while(x<p)
        {
        count++;
        p=p/2;
        int m=Math.min(q,p);
        int n=Math.max(q,p);
        q=n;
        p=m;  
        }
        return count;
    }
   
}

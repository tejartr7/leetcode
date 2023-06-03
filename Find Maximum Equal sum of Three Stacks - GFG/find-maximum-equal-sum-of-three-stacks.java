//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 3);
            
            
            int[] S1 = IntArray.input(br, a[0]);
            
            
            int[] S2 = IntArray.input(br, a[1]);
            
            
            int[] S3 = IntArray.input(br, a[2]);
            
            Solution obj = new Solution();
            int res = obj.maxEqualSum(a[0],a[1],a[2], S1, S2, S3);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends

class Solution {
    public static int maxEqualSum(int n1,int n2,int n3, int[] s1, int[] s2, int[] s3) {
        // code here
        int pre1[]=new int[n1];
        int pre2[]=new int[n2];
        int pre3[]=new int[n3];
        int i,j;
        for(i=n1-1;i>=0;i--)
        {
            if(i==n1-1)
            pre1[i]=s1[i];
            else pre1[i]=s1[i]+pre1[i+1];
        }
        for(i=n2-1;i>=0;i--)
        {
            if(i==n2-1)
            pre2[i]=s2[i];
            else pre2[i]=s2[i]+pre2[i+1];
        }
        for(i=n3-1;i>=0;i--)
        {
            if(i==n3-1)
            pre3[i]=s3[i];
            else pre3[i]=s3[i]+pre3[i+1];
        }
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int x:pre1)
        set1.add(x);
        for(int x:pre2)
        set2.add(x);
        for(int x:pre3)
        {
            if(set1.contains(x) && set2.contains(x))
            return x;
        }
        return 0;
    }
}
      
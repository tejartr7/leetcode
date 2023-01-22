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
            
            int N;
            N = Integer.parseInt(br.readLine());
            
            
            int K;
            K = Integer.parseInt(br.readLine());
            
            
            int[] arr = IntArray.input(br, N);
            
            Solution obj = new Solution();
            int res = obj.solve(N, K, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int solve(int n, int k, int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int i;
        for(i=1;i<n;i++)
        {
            arr[i]+=arr[i-1];
        }
        for(i=1;i*i<=arr[n-1];i++)
        {
            if(arr[n-1]%i==0)
            {
                list.add(i);
                list.add(arr[n-1]/i);
            }
        }
        int ans=1;
        for(int x:list)
        {
            int count=0;
            for(int m:arr)
            {
                if(m%x==0)
                {
                    count++;
                }
            }
            if(count>=k)
            ans=Math.max(ans,x);
        }
        return ans;
    }
}
        

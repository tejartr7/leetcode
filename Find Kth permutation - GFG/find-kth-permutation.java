//{ Driver Code Starts
import java.io.*;
import java.util.*;

// } Driver Code Ends


class Solution {
    static int [] fact;
    static ArrayList<Integer> digits;
    public static void solve(int n, int k, StringBuilder ans){
        if(n==1){
            ans.append(Integer.toString(digits.get(0)));
            return;
        }
        int ind = k/fact[n-1];
        if(k%(fact[n-1]) == 0) ind--;
        
        ans.append(Integer.toString(digits.get(ind)));
        digits.remove(ind);
        k -= fact[n-1]*ind;
        
        solve(n-1, k, ans);
    }
    public static String kthPermutation(int n,int k) {
        // code here
        fact = new int [n];
        fact[0] = 1;
        for(int i=1; i<n; i++){
            fact[i] = i*fact[i-1];
        }
        digits = new ArrayList<>();
        for(int i=1; i<=n; i++){
            digits.add(i);
        }
        StringBuilder res = new StringBuilder();
        solve(n,k,res);
        return res.toString();
    }
}


//{ Driver Code Starts.

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
            
            int[] a = IntArray.input(br, 2);
            
            Solution obj = new Solution();
            String res = obj.kthPermutation(a[0],a[1]);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends
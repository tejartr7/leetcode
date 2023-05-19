//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine());
        
        while(t-- > 0){
            int n=Integer.parseInt(in.readLine().trim());
            int range[][]=new int[n][2];
            for(int i=0;i<n;i++){
                String s[]=in.readLine().trim().split(" ");
                range[i][0]=Integer.parseInt(s[0]);
                range[i][1]=Integer.parseInt(s[1]);
            }
            int q=Integer.parseInt(in.readLine().trim());
            int Q[]=new int[q];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<q;i++){
                Q[i]=Integer.parseInt(s[i]);
            }

            Solution ob=new Solution();
            ArrayList<Integer> ans=ob.kthSmallestNum(n, range, q, Q);

            for(int i:ans){
                out.print(i+" ");
            }out.println();
        }
        out.close();
    } 
}
// } Driver Code Ends



class Solution {
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] r, int qn, int[] q) {
       ArrayList<Integer> res = new ArrayList<>();
       Arrays.sort(r, (a, b)->a[0] != b[0] ? a[0]-b[0]: b[1]-a[1]);
    
       for(int quer : q){
           int temp = util(r, quer);
            res.add(temp);
       }
       return res;
       
    }
    public static int util(int[][] range, int k) {
        int i = 1;
        if(k <= range[0][1]-range[0][0]+1) return  range[0][0]+k-1;
        k = k-(range[0][1]-range[0][0]+1);
        int prevEnd = range[0][1];
        while(i<range.length){
            // System.out.println(prevEnd+" "+k);
            if(prevEnd < range[i][0]){
                prevEnd  = range[i][0];
            }else{
                prevEnd++;
            }
                    if(k <= range[i][1]-prevEnd+1){
                        return prevEnd+k-1;
                    }else{
                        k = k-(range[i][1]-prevEnd+1);
                    }
            prevEnd  = range[i][1];
            i++;
        }
        return -1;
       
    }
} 
      
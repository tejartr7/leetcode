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
    public static int[][] overlappedInterval(int[][] intervals)
    {
        // Code here // Code here
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       ArrayList<int[]> res=new ArrayList<>();
       int i,j=0,n=intervals.length;
       res.add(intervals[0]);
       for(i=1;i<n;i++)
       {
           int []x=res.get(j);
           if(intervals[i][0]<=x[1] || intervals[i][1]+1==x[1])
           {
               x[1]=Math.max(x[1],intervals[i][1]);
           }
           else
           {
               res.add(intervals[i]);
               j++;
               
           }
       }
       int ans[][]=new int[j+1][2];
       for(i=0;i<=j;i++)
       ans[i]=res.get(i);
       return ans;
    }
    public static ArrayList<Integer> kthSmallestNum(int n, int[][] range, int q, int[] queries) {
        // code here
        int merge[][]=overlappedInterval(range);
        ArrayList<Integer> ans=new ArrayList<>();
        //Arrays.fill(ans,-1);
        int i,j;
        int l=merge.length;
        for(i=0;i<q;i++)
        {
            int x=queries[i];
            for(j=0;j<l;j++)
            {
                int curr=merge[j][1]-merge[j][0]+1;
                if(x<=curr)
                {
                    // int val=bin(x,merge[j][0],merge[j][1]);
                    int val=merge[j][0]+x-1;
                    ans.add(val);
                    x-=curr;
                    break;
                }
                else x-=curr;
            }
            if(x>0)
            {
                ans.add(-1);
            }
        }
        return ans;
    }
    // public static int bin(int target,int start,int end)
    // {
    //     int s=start;
    //     int l=0,h=end-start;
    //     while(l<h)
    //     {
    //         int mid=l+(h-l)/2;
    //         if(mid==target-1) return mid+s;
    //         else if(mid>target-1)
    //         {
    //             h=mid;
    //         }
    //         else l=mid-1;
    //     }
    //     return -1;
    // }
} 
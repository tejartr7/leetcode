//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String[] input = new String[2]; 
            input = read.readLine().split(" "); 
            int R = Integer.parseInt(input[0]); 
            int C = Integer.parseInt(input[1]); 
            String s1[] = read.readLine().trim().split("\\s+");
            int a[][] = new int[R][C];
            for(int i = 0;i < R*C;i++)
                a[i/C][i%C] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int[] ans = ob.reverseSpiral(R,C,a);
            for(int i = 0; i < ans.length; i++)
            {
                System.out.print(ans[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    public int[] reverseSpiral(int R, int C, int[][] a)
    {
        int amin=0,amax=a.length-1,bmin=0,bmax=a[0].length-1;
        List<Integer> list=new ArrayList<>();  
        boolean visited[][]=new boolean[amax+1][bmax+1];
        while(amin<=amax && bmin<=bmax)
        {
            int i,j;
            i=amin;
            for(j=bmin;j<=bmax;j++)
            {   if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            amin++;
            j=bmax;
            for(i=amin;i<=amax;i++)
            {
               if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            bmax--;
            i=amax;
            for(j=bmax;j>=bmin;j--)
            {
                if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            amax--;
            j=bmin;
            for(i=amax;i>=amin;i--)
            {
                if(!visited[i][j]){
                list.add(a[i][j]);
                visited[i][j]=true;
            }
            }
            bmin++;
        }
        int i,j;
        i=list.size()-1;
        j=0;
        int ans[]=new int[i+1];
        while(i>=0)
        {
            ans[j++]=list.get(i--);
        }
        return ans;
    }
}
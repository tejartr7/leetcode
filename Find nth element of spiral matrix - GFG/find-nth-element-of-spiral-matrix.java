//{ Driver Code Starts
import java.util.*;

class Find_Given_Element_Of_Spiral_Matrix 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t > 0)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
			int arr[][] = new int[1000][1000];
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++ )
				{
					arr[i][j] = sc.nextInt();
				}
			}
			System.out.println(new GfG().findK(arr, n, m, k));
		t--;
		}
	}
}
// } Driver Code Ends


class GfG
{
    /*You are required to complete this method*/
    int findK(int a[][], int n, int m, int k)
    {
	
        int amin=0,amax=n-1,bmin=0,bmax=m-1;
        int r=a.length,l=a[0].length;
        List<Integer> list=new ArrayList<>();    
        while(amin<=amax && bmin<=bmax)
        {
            int i,j;
            i=amin;
            for(j=bmin;j<=bmax;j++)
            {
                list.add(a[i][j]);
            }
            amin++;
            j=bmax;
            for(i=amin;i<=amax;i++)
            {
                list.add(a[i][j]);
            }
            bmax--;
            i=amax;
            for(j=bmax;j>=bmin;j--)
            {
                list.add(a[i][j]);
            }
            amax--;
            j=bmin;
            for(i=amax;i>=amin;i--)
            {
                list.add(a[i][j]);
            }
            bmin++;
        }
        return list.get(k-1);   
    }
}
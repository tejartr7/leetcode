class Solution {
    public int uniquePaths(int m, int n) {
        int arr[][]=new int[m][n];
        int i,j;
        //bottom up method of tabulation
        if(m==1 && n==1) return 1;
        if(m==2 && n==1) return 1;
        if(m==1 && n==2) return 1;
        j=n-1;
        for(i=0;i<m;i++)
            arr[i][j]=1;
        i=m-1;
        for(j=0;j<n;j++)
            arr[i][j]=1;
        for(i=m-2;i>=0;i--)
        {
            for(j=n-2;j>=0;j--)
            {
                arr[i][j]=arr[i+1][j]+arr[i][j+1];
            }
        }
        return arr[0][0];
    }
}
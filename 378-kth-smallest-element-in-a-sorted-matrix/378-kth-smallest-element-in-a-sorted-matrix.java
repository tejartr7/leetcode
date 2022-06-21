class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int l=matrix.length;
        int b=matrix[0].length;
        int []a=new int[l*b];
        int i=0;
        int j,kk;
        for(j=0;j<l;j++)
        {
            for(kk=0;kk<b;kk++)
            {
                a[i]=matrix[j][kk];
                i++;
            }
        }
        Arrays.sort(a);
        if(k<=l*b)
        {
            return a[k-1];
        }
        return -1;
            
    }
}
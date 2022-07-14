class Solution {
    public void moveZeroes(int[] a) {
      int i,j;
        int n=a.length;
        int s=0;
        int []b=new int[a.length];
        Arrays.fill(b,0);
        for(i=0;i<n;i++)
        {
           if(a[i]!=0)
           {b[s]=a[i];
            s++;
           }
        }
         for(i=0;i<n;i++)
        {a[i]=b[i];
        }
    }
}
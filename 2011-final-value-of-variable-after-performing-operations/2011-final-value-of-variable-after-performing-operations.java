class Solution {
    public int finalValueAfterOperations(String[] o) {
        int x=0;
        int l=o.length;
        int i;
        for(i=0;i<l;i++)
        {
            if(o[i].equals("--X")||o[i].equals("X--"))
            {
                x--;
            }
            else
            {
                x++;
            }
        }
        return x;
    }
}
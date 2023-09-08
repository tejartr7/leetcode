public class Solution {
public List<List<Integer>> generate(int n)
{
	List<List<Integer>> allrows = new ArrayList<List<Integer>>();
	List<Integer> temp=new ArrayList<>();
    temp.add(1);
    allrows.add(new ArrayList<>(temp));
    int i,j;
    int cnt=2;
    for(i=2;i<=n;i++)
    {
        List<Integer> curr=new ArrayList<>();
        curr.add(1);
        if(i>2){
        for(j=1;j<i-1;j++)
        {
            curr.add(temp.get(j-1)+temp.get(j));
        }
        }
        curr.add(1);        
        allrows.add(new ArrayList<>(curr));
        temp=curr;
    }
    return allrows;
}
}
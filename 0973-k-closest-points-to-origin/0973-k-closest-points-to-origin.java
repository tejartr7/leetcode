import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        List<Integer> listx = new ArrayList<>();
        List<Integer> listy = new ArrayList<>();
        int i, j, n = points.length;
        Map<Double, List<Integer>> map = new HashMap<>();
        PriorityQueue<Double> pq=new PriorityQueue<>();
        int [][]ans=new int[k][2];
        for(i=0;i<n;i++)
        {
            List<Integer> dummy=new ArrayList<>();
            double temp=(double)Math.sqrt(points[i][0]*points[i][0]+points[i][1]*points[i][1]);
            listx.add(points[i][0]);
            listy.add(points[i][1]);
            pq.add(temp);
            if(map.containsKey(temp))
            {
             dummy=map.get(temp);
             dummy.add(i);
             map.put(temp,dummy);
             
            }
            else
            {   dummy.add(i);
                map.put(temp,dummy);
            }
        }
        i=0;
        while(k>0)
        {
            double temp=pq.peek();
            List<Integer> l=map.get(pq.peek());
            pq.remove(temp);
            if(k<=0)
            break;
            int size=l.size();
            for(j=0;j<size;j++)
            {
                if(k<=0)
                 break;
                int x=l.get(j);
                ans[i][0]=listx.get(x);
                ans[i][1]=listy.get(x);
                i++;
                k--;
            }
        }
        return ans;
    }
}
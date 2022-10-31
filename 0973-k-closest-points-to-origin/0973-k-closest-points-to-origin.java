import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

class Solution {
    private Double getDistance(int[] point) {
        return Math.sqrt((point[0] * point[0]) + (point[1] * point[1]));
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
        (p1, p2) -> getDistance(p1).compareTo(getDistance(p2)));
        int i,n=points.length;
        int [][]closePoints=new int[k][2];
        for(i=0;i<n;i++)
        {
            pq.add(points[i]);
        }
        for(i=0;i<k;i++)
        {
            closePoints[i]=pq.poll();
        }
        return closePoints;
    }
}
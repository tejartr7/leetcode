

import java.io.*;
import java.util.*;
class Solution {
     public  ArrayList<Integer> getPrimes(int n) {
        boolean visited[] = new boolean[n + 1];
        Arrays.fill(visited, true);
        visited[0]=visited[1]=false;
         ArrayList<Integer> list=new ArrayList<>();
        int i,j;
        for(i=2;i*i<=n;i++)
        {
            if(visited[i])
            {
               for(j=2*i;j<n;j+=i)
                   visited[j]=false;
            }
        }
        for(i=2;i<=n;i++)
            if(visited[i])
                list.add(i);
         return list;
    }
    public  boolean primeSubOperation(int[] nums) {
        ArrayList<Integer> prime=getPrimes(1000);
        //System.out.println(prime);
        int i,n=nums.length;
        int maxi=nums[n-1];
        for(i=n-2;i>=0;i--)
        {
            if(nums[i]>=nums[i+1])
            {
                boolean flag=false;
                for(int x:prime)
                {
                    if(x<nums[i] && (nums[i]-x)<nums[i+1])
                    {
                        nums[i]-=x;
                        flag=true;
                        break;
                    }
                }
                if(!flag) return flag;
            }
        }
        return true;
    }
}
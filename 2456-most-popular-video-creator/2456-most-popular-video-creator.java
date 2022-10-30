import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> mostPopularCreator(String[] c, String[] ids, int[] views) {
        Map<String,Integer> cmap=new HashMap<>();
        Map<String,String>  idMap=new HashMap<>();
        Map<String,Integer> maxMap=new HashMap<>();
        int i,n=c.length;
        for(i=0;i<n;i++)
        {
            String x=c[i];
            cmap.put(x,cmap.getOrDefault(x, 0)+views[i]);
            if(!idMap.containsKey(x))
            {
                idMap.put(x,ids[i]);
            }
            if(!maxMap.containsKey(x))
            {
                maxMap.put(x,views[i]);
            }
            if(maxMap.containsKey(x))
            {   if(views[i]==maxMap.get(x))
                {   int temp=idMap.get(x).compareTo(ids[i]);
                    if(temp<0)
                    idMap.put(x,idMap.get(x));
                    else if(temp>0)
                    idMap.put(x,ids[i]);
                }
                else if(views[i]>maxMap.get(x))
                {
                    maxMap.put(x,views[i]);
                    idMap.put(x,ids[i]);
                }
            }

        }
        List<List<String>> list=new ArrayList<>();
        int max=0;
        for(String x:cmap.keySet())
        {
            max=Math.max(max,cmap.get(x));
        }
        for(String x:cmap.keySet())
        {   List<String> alist=new ArrayList<>();
            if(cmap.get(x)==max)
            {
                alist.add(x);
                alist.add(idMap.get(x));
            }
            if(alist.size()==2)
            list.add(alist);
        }
        return list;
    }
}
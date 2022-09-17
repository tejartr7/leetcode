class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String a1[]=arriveAlice.split("-");
        String a2[]=leaveAlice.split("-");
        String b1[]=arriveBob.split("-");
        String b2[]=leaveBob.split("-");
        int i;
        Map<Integer,Integer> a=new HashMap<>();
        a.put(1,31);
        a.put(2,28);
        a.put(3,31);
        a.put(4,30);
        a.put(5,31);
        a.put(6,30);
        a.put(7,31);
        a.put(8,31);
        a.put(9,30);
        a.put(10,31);
        a.put(11,30);
        a.put(12,31);
        int x1[]=new int[2];
        int x2[]=new int[2];
        int y1[]=new int[2];
        int y2[]=new int[2];
        for(i=0;i<2;i++)
            x1[i]=Integer.parseInt(a1[i]);
        for(i=0;i<2;i++)
            x2[i]=Integer.parseInt(a2[i]);
        for(i=0;i<2;i++)
            y1[i]=Integer.parseInt(b1[i]);
        for(i=0;i<2;i++)
            y2[i]=Integer.parseInt(b2[i]);
        int count=0;
        int min[]=new int[2];
        int max[]=new int[2];
        if(x1[0]>y1[0])
        {
            min[0]=x1[0];
            min[1]=x1[1];
            
        }
        if(y1[0]>x1[0])
        {
            min[0]=y1[0];
            min[1]=y1[1];
        }
        if(y1[0]==x1[0])
        {
            min[0]=y1[0];
            min[1]=Math.max(y1[1],x1[1]);
        }
        if(x2[0]>y2[0])
        {
            max[0]=y2[0];
            max[1]=y2[1];
            
        }
        if(y2[0]>x2[0])
        {
            max[0]=x2[0];
            max[1]=x2[1];
        }
        if(y2[0]==x2[0])
        {
            max[0]=y2[0];
            max[1]=Math.min(y2[1],x2[1]);
        }
        
       
        if(min[0]<=max[0])
        {
            if(min[0]==max[0])
            {
                if(min[1]<=max[1])
                    count+=1+max[1]-min[1];
            }
            else
            {
                int x=a.get(min[0]);
                int y=min[1];
                if(y<=x)
                    count+=1+x-y;
                min[0]++;
                min[1]=0;
                while(min[0]<=max[0])
                {   
                    
            if(min[0]==max[0])
            {
                if(min[1]<=max[1])
                    count+=max[1]-min[1];
            }
                    else
                    count+=a.get(min[0]);
                    min[0]++;
                }
                    
            }
        }
        
        
        return count;
        
    }
}
class sai
{
    int x;
    int y;
    sai(int a,int b)
    {
        x=a;
        y=b;
    }
}
class teja
{
    String p;
    int q;
    teja(String a,int b)
    {
        p=a;
        q=b;
    }
}
class UndergroundSystem {
    Map<Integer,teja> entry=new HashMap<>();
    Map<String,sai> map=new HashMap<>();
    public UndergroundSystem() {
        
    }
    
    public void checkIn(int id, String stationName, int t) {
        entry.put(id,new teja(stationName,t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        teja temp=entry.get(id);
        entry.remove(id);
        String x=temp.p+"."+stationName;
        if(!map.containsKey(x))
        {
            map.put(x,new sai(t-temp.q,1));
        }
        else
        {
            sai pavan=map.get(x);
            map.put(x,new sai((t-temp.q)+pavan.x,pavan.y+1));
        }
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String x=startStation+"."+endStation;
        if(map.containsKey(x))
        {
            double sum=(double)map.get(x).x;
            double cnt=(double)map.get(x).y;
            return (double)(sum/cnt);
        }
        return (double)-1;
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
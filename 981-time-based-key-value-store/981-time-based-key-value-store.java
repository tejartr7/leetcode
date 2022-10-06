class TimeMap {
    Map<String,String> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        String x=key+" "+timestamp;
        map.put(x,value);
    }
    
    public String get(String key, int timestamp) {
       
        String x=key+" "+timestamp;
        String ret="";
        while(timestamp>0)
        {   x=key+" "+timestamp;
            if(map.containsKey(x))
            {
                
                return map.get(x);
            }
            timestamp--;
        }
        return ret;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
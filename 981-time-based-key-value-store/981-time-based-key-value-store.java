class TimeMap {
    //brute force method 
    Map<String,HashMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<String,HashMap<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
           map.put(key, new HashMap<Integer, String>());
        }
        map.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
       
      if(!map.containsKey(key))
          return "";
      int i;
      for(i=timestamp;i>0;i--)
      {
          if(map.get(key).containsKey(i))
              return map.get(key).get(i);
      }
      return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */
class LRUCache {
    LinkedHashMap<Integer,Integer> map;
    int max;
    public LRUCache(int capacity) {
        map=new LinkedHashMap<>();
        max=capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            int x=map.get(key);
            makeRecent(key,x);
            return x;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        makeRecent(key,value);
        if(map.size()>max)
        {
            for(int x:map.keySet())
            {
                map.remove(x);
                break;
            }
        }
    }
    public void makeRecent(int key,int value)
    {
        map.remove(key);
        map.put(key,value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
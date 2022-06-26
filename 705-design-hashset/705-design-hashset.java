class MyHashSet {
  boolean []a;
    public MyHashSet() {
        a=new boolean[1000001];
    }
    
    public void add(int key) {
        a[key]=true;
    }
    
    public void remove(int key) {
        a[key]=false;
    }
    
    public boolean contains(int key) {
        return a[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
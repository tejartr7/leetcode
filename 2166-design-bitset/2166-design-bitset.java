class Bitset {
    int size;
    Set<Integer> one=new HashSet<>();
    Set<Integer> zero=new HashSet<>();
    public Bitset(int size) {
        this.size=size;
        for(int i=0;i<size;i++)
            zero.add(i);
    }
    
    public void fix(int idx) {
        one.add(idx);
        zero.remove(idx);
    }
    
    public void unfix(int idx) {
        one.remove(idx);
        zero.add(idx);
    }
    
    public void flip() {
        Set<Integer> temp=one;
        one=zero;
        zero=temp;
    }
    
    public boolean all() {
        return one.size()==size;
    }
    
    public boolean one() {
        return one.size()>0;
    }
    
    public int count() {
        return one.size();
    }
    
    public String toString() {
        StringBuilder sb=  new StringBuilder();
        for(int i=0;i<size;i++) {
            if(one.contains(i)) sb.append("1"); 
            else if(zero.contains(i)) sb.append("0");
        }
        return sb.toString();
    }
}

/**
 * Your Bitset object will be instantiated and called as such:
 * Bitset obj = new Bitset(size);
 * obj.fix(idx);
 * obj.unfix(idx);
 * obj.flip();
 * boolean param_4 = obj.all();
 * boolean param_5 = obj.one();
 * int param_6 = obj.count();
 * String param_7 = obj.toString();
 */
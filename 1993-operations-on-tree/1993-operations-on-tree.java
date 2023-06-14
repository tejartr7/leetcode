class LockingTree {
    int par[];
    Map<Integer,List<Integer>> adj=new HashMap<>();
    Map<Integer,Integer> map=new HashMap<>();
  
    public LockingTree(int[] parent) {
        par=parent;
        for(int i=0;i<par.length;i++)
        {
            if(!adj.containsKey(par[i]))
                adj.put(par[i],new ArrayList<>());
            adj.get(par[i]).add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(map.containsKey(num)) return false;
        map.put(num,user);
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(map.containsKey(num))
        {
            boolean x=map.get(num)==user;
            if(x)
                map.remove(num);
            if(x)
            return true;
        }
        return false;
    }
    public void dfs(int x,List<Integer> list)
    {
        
        if(map.containsKey(x))
            list.add(x);
        if(!adj.containsKey(x) || adj.get(x).size()==0) return ;
        for(int temp:adj.get(x))
        {
            dfs(temp,list);
        }
    }
    public boolean upgrade(int num, int user) {
        //System.out.println(adj);
        if(map.containsKey(num)) return false;
        boolean p=false;
        boolean q=false;
        List<Integer> list=new ArrayList<>();
        if(!adj.containsKey(num)) return false;
        for(int x:adj.get(num))
        {
            dfs(x,list);
        }
        //System.out.println(list);
        if(list.size()==0) return false;
        
        int parent=par[num];
        while(parent!=-1)
        {
            if(map.containsKey(parent)) return false;
            parent=par[parent];
        }
        for(int x:list)
        {
            map.remove(x);
        }
        map.put(num,user);
        return true;
    }
}

/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */
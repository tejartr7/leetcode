class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if(!check(end,bank))return -1;
        
        Queue<String> q=new LinkedList<>();
         q.add(start);

        Map<String,Integer> m=new HashMap<>();
        m.put(start,0);
        
        List<String> visi=new ArrayList<>();
        visi.add(start);
        
        String str="ACGT";
        
        while(!q.isEmpty()){
            
            String gene = q.poll();
            int level = m.get(gene);
            if(gene.equals(end)) return level;
            
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<4;j++){
                
                String new_gene = gene.substring(0,i)+
                                  str.charAt(j)+
                                  gene.substring(i+1,gene.length());
                
                if( !visi.contains(new_gene) && check(new_gene,bank) ){
                    q.add(new_gene);
                    m.put(new_gene,level+1);
                    visi.add(new_gene);
                }
            }
        }
            
        }
        
        return -1;
    }
    
    
    // here , it is check string conatins in bank or not 
    
    public boolean check(String str,String[] b)
    {
        int c=0;
        for(String s:b){
            if(s.equals(str))c++;
        }
        return c!=0;
    }
}
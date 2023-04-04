class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> supply=new HashSet<>();
        for(String x:supplies)
            supply.add(x);
        List<String> res=new ArrayList<>();
        int count=0;
        while(count<100){
        boolean found=false;
        for(int i=0;i<recipes.length;i++)
        {
            boolean flag=true;
            if(supply.contains(recipes[i]))
                continue;
            for(String curr:ingredients.get(i))
            {
                if(!supply.contains(curr))
                {
                    if(res.contains(curr))
                       { 
                        continue;
                       }
                    flag=false;
                }
            }
            if(flag)
            {
             res.add(recipes[i]);
             found=true;
             supply.add(recipes[i]);
            }
        }
        if(!found) break;
        count++;
        }
        return res;
    }
}
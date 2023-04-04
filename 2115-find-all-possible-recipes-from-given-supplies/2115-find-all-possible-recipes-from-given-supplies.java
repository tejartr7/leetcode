class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> supply=new HashSet<>();
       
        for(int i = 0; i < supplies.length; i++)
            supply.add(supplies[i]);
        List<String> res=new ArrayList<>();
        boolean found=true;
        while(found){
        found=false;
        for(int i=0;i<recipes.length;i++)
        {
            if(supply.contains(recipes[i]))
                continue;
            boolean flag=true;
            for(int j=0;j<ingredients.get(i).size();j++)
            {
                if(!supply.contains(ingredients.get(i).get(j)))
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
             res.add(recipes[i]);
             found=true;
             supply.add(recipes[i]);
            }
          }
        }
        return res;
    }
}
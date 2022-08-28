class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();            //used to store the result (all the possible combonations)
        List<Integer> combinations = new ArrayList<>();            //use to store the combinations or we can say that subset

        solveitforMe(1,n,k,combinations,result);                   //Actual recursive logic

        return result;                
    }

    private void solveitforMe(int num, int n, int k, List<Integer> combinations, List<List<Integer>> result){

        if(num>n+1)                                         //OUR BASE CONDITION...if num is greater than the given n+1 then return (No more recusrive calls)
            return;

        if(combinations.size() == k){                       //ANOTHER BASE CONDITION... if temp list size i=is equals to the given k, then it means we one of our combinations
            // System.out.println(combinations);
            result.add(new ArrayList(combinations));        //Add that combination into the result list and return
            return;
        }

        combinations.add(num);                              //Add(TAKE) that number (we two choose TAKE & DON'T TAKE)
        solveitforMe(num+1,n,k,combinations,result);        //Do the recursive call further
    
    combinations.remove(combinations.size()-1);         //DON'T TAKE that number
    solveitforMe(num+1,n,k,combinations,result);        // & Do the recursive call further
    }

}
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> zeroLoss = new HashSet<>(), oneLoss = new HashSet<>(),
                moreLosses = new HashSet<>();
        int i,n=matches.length;
        for(i=0;i<n;i++)
        {
            int win=matches[i][0];
            int loss=matches[i][1];
             if(!oneLoss.contains(win) && !moreLosses.contains(win))
            {
                zeroLoss.add(win);
            }
            if(zeroLoss.contains(loss))
            { zeroLoss.remove(loss); 
              oneLoss.add(loss);
            }
            else if(oneLoss.contains(loss))
            {    oneLoss.remove(loss);
                 moreLosses.add(loss);
            }
            else if(moreLosses.contains(loss))
                continue;
            else
                oneLoss.add(loss) ;
        }
        List<List<Integer>> answer =
            Arrays.asList(new ArrayList<>(), new ArrayList<>());
        answer.get(0).addAll(zeroLoss);
        answer.get(1).addAll(oneLoss);
        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));

        return answer;
    }
}
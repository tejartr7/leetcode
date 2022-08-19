class Solution {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] ret = new int[queries.length];
		for(int i=0;i<queries.length;i++){
			int k = queries[i][0];
			int trim = queries[i][1];
			PriorityQueue<String[]> maxHeap = new PriorityQueue<>((x,y)->{
				if(!y[0].equals(x[0])) return y[0].compareTo(x[0]);
				return Integer.valueOf(y[1]) - Integer.valueOf(x[1]);
			});
			for(int j=0;j<nums.length;j++){
				maxHeap.offer(new String[]{trimNum(trim,nums[j]),String.valueOf(j)});
				if(maxHeap.size()>k){
					maxHeap.poll();
				}
			}
			ret[i] = Integer.valueOf(maxHeap.poll()[1]);
		}
		return ret; 
	}

	public String trimNum(int trim,String num){
		StringBuilder sb = new StringBuilder();
		for(int i=num.length()-1;i>=0 && --trim>=0; i--){
			sb.append(num.charAt(i));
		}
		return sb.reverse().toString();
    }
}
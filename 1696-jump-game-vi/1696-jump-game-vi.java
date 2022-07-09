class Solution {
   public int maxResult(int[] nums, int k) {
	int len=nums.length;
	int[] score=new int[len];
	score[0]=nums[0];

	//a list of previous positon we can use, the first one is best one
	LinkedList<Integer> list=new LinkedList<>(); 
	list.add(0);

	for(int i=1;i<len;++i){

		if(list.getFirst()<i-k){
			//we can not reach i from this position
			list.removeFirst();
		}

		//first position is best choice
		int cur=nums[i]+score[list.getFirst()];
		score[i]=cur;

		//if from current position to next positon is better then last position of list, remove last postion of list
		while(!list.isEmpty() && score[list.getLast()]<cur){
			list.removeLast();
		}

		list.addLast(i);
	}

	return score[len-1];
}
}
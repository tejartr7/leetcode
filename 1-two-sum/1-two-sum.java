class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum=0;
        int res[] = new int[2];
        int n =nums.length;
        for(int i=0;i<n;i++){
            sum=target-nums[i];
            if(map.containsKey(sum)){
              int count=map.get(sum);
                res[0]=count;
                res[1]=i;
                break;
                
            }
            map.put(nums[i],i);
        }
        return res;
        
    }
}
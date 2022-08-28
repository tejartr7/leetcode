class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutations(nums,0,list);
        return list;
    }
    
    public void permutations(int[] nums,int i,List<List<Integer>> list) {
        if(i==nums.length) {
            List<Integer> sublist = new ArrayList<>();
            for(int j=0;j<nums.length;j++){
                sublist.add(nums[j]);
            }
            list.add(sublist);
            return;
        }
        for(int start=i;start<nums.length;start++) {
            swap(nums,i,start);
            permutations(nums,i+1,list);  
            swap(nums,i,start);            
        }

    }
    
    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
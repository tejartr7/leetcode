class Solution {
    List<List<Integer>> list;
    
    public void helper(int idx, List<Integer> temp, int n, int k) {
        if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }
        for (int i = idx; i <= n; i++) {
            temp.add(i);
            helper(i + 1, new ArrayList<>(temp), n, k);
            temp.remove(temp.size() - 1);
        }
    }
    
    public List<List<Integer>> combine(int n, int k) {
        list = new ArrayList<>();
        helper(1, new ArrayList<>(), n, k);
        return list;
    }
}

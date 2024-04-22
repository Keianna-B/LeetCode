class Solution {
    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        findSubsets(new ArrayList<>(), nums, 0);
        return list;
    }

    private void findSubsets(List<Integer> temp, int [] nums, int start){
        list.add(new ArrayList<>(temp));

        for(int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            findSubsets(temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
class Solution {
    List<List<Integer>> list = new ArrayList<>();
    int n;

    public List<List<Integer>> subsets(int[] nums) {
        n = nums.length;
        helper(new ArrayList<>(), nums, 0);
        return list;
    }

    private void helper(List<Integer> temp, int [] nums, int start){
        if (start == n) {
            list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[start]);
        helper(temp, nums, start + 1);

        temp.remove(temp.size() - 1);

        helper(temp, nums, start +1);

    }
}
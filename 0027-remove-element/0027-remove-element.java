class Solution {
    public int removeElement(int[] nums, int val) {
        // k represents # of nums != val
        int k = 0;
        // set first k elements of nums to a k value
        for (int i = 0; i < nums.length; i++) {
            // if find k (not val) value
            if (nums[i] != val) {
                // set element k to current value and increment k (post increment)
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
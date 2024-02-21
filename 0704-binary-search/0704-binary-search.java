class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1;
        int index;
        while(left <= right){
            index = left+ (right-left)/2;
            if (nums[index] == target){
                return index;
            }
            else if(nums[index] < target){
                left = index + 1;
            }
            else{
                right = index - 1;
            }
        }

        return -1;
    }
}
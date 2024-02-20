class Solution {
    public int missingNumber(int[] nums) {
        int answer = 0;
        Set<Integer> setNums = new HashSet<>();

        for (int num: nums){
            setNums.add(num);
        }
        for(int i = 1; i <= nums.length; i++){
            if(!setNums.contains(i)){
                return answer = i;
            }
        }
        return answer;
    }
}
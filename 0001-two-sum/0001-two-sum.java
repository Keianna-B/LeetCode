class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Array returns the indexes that gives sum
        int [] sum = new int[2];
        //Nested loop comparing the sum of two indexes to result
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i+1; j < nums.length; j++)
            {
            //Check if the sum of index i and j = result
                if(nums[i] + nums[j] == target)
                {
                    //Store the indexes in sum
                    sum[0] = i;
                    sum[1] = j;
                    //return sum
                    return sum;
                }   

            } 
        }
        return sum;
    }
}
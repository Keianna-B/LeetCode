class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] *= nums[i];        
        }
        return countingSort(nums);
    }

    public static int[] countingSort(int[] input){
        int length = input.length;
        int maximum = 0;

        for(int i = 0; i < length; i++)
        {
            maximum = Math.max(maximum, input[i]);
        }

        int[] count = new int[maximum+1];

        for (int i = 0; i < length; i++) 
        {
            count[input[i]]++;
        }
 
        for (int i = 1; i <= maximum; i++) 
        {
            count[i] += count[i - 1];
        }

        int [] output = new int [length];

        for (int i = length - 1; i >= 0; i--) 
        {
            output[count[input[i]] - 1] = input[i];
            count[input[i]]--;
        }
 
        return output;
    }

}
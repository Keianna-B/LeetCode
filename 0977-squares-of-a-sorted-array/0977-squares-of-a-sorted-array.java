class Solution {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            nums[i] *= nums[i];        
        }
        return radixSort(nums, nums.length);
    }

    public static int[] radixSort(int input[], int n){
        int maximum = 0;
                
        for(int i = 0; i < n; i++)
        {
            maximum = Math.max(maximum, input[i]);
        }

        for(int exponent = 1; maximum/exponent > 0; exponent *= 10){
            countSort(input, n, exponent);
        }
        return input;
    }

    public static void countSort(int[] input, int n, int exp){
        int output[] = new int[n];
        int i;
        int count[] = new int[10];
        Arrays.fill(count,0);

        for(i=0; i < n; i++)
        {
            count[(input[i]/exp)%10]++;
        }

        for (i = 1; i < 10; i++)
        {
            count[i] += count[i - 1];
        }
 
        for (i = n - 1; i >= 0; i--) {
            output[count[(input[i] / exp) % 10] - 1] = input[i];
            count[(input[i] / exp) % 10]--;
        }
        for(i = 0; i < n; i++)
        {
            input[i] = output[i];
        }
        //return output;
    }

}
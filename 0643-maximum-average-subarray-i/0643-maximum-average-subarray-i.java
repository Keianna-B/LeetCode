class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage;
        int sum = 0;
        for(int l=0; l < k; l++)
        {
            sum += nums[l];
        }
        maxAverage = (double) sum/k;
       //left value being subtracted from sum
        int i = 0;
        //right value being added to sum
        int j = k;
        while(j < nums.length)
        {
            sum = sum -nums[i] + nums[j];
            if(maxAverage < (double)sum/k)
            {
                maxAverage = (double)sum/k;
            }
            i++;
            j++;
        }
        return maxAverage;

    }
}
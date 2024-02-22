class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int left = 0, right = x;
        while(left <= right)
        {
            int middle = left +(right-left)/2;
            if(middle == x/middle)
            {
                return middle;
            }
            else if(middle > x/middle)
            {
                right = middle - 1;
            }
            else{
                left = middle + 1;
            }
        }
        return Math.round(right);
    }
}
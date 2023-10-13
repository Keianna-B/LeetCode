class Solution {
public:
    double myPow(double x, int n) 
    {
        //current exponent counter
        //convert negative exponent to positive using abs() 
        long int n_counter = abs(n);

        //if n is 0 power is 1 & multiplying 1 by x gives you x
        double power=1;

        //Calculate x^n using binary exponentiation over repeated multiplication to 
        //reduce complexity from O(n) to O(logn)
        while(n_counter > 0)
        {
            //If the current exponent is odd multiply power by x and 
            //decrement n_counter
            if(n_counter%2 == 1)
            {
                power *= x;
                n_counter--;
            }
            //If the current power is even square x and devide n_counter by 2
            else
            {
                x *= x;
                n_counter /= 2;
            }
        }
        // x^(-n) is equal to the reciprocal of x^n
        if (n < 0)
        {
                power = 1/power;          
        }
        return power;
    }

};
import java.lang.Math;
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> sequence = new ArrayList<Integer>();
        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    sequence.add(num);
                }
                ++nextDigit;
            }
        }

        sequence.sort(null);
        return sequence;
    }
}
/*
        int num = low;
        int d=1;
        //process low
        //process high
        //add
        while(num%10 != 9)
        {
            num = Math.pow(10,d)
        }
    }
}*/
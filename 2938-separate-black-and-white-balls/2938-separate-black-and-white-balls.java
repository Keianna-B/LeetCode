class Solution {
    public long minimumSteps(String s) {
        long steps = 0;
        int black = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                steps += (long) black;
            }     
            else{
                black++;
            }
        }
        return steps;
    }
}
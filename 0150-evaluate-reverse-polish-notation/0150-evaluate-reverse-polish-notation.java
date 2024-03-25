class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int n = tokens.length;
        for (int i = 0; i < n; i++) {
            if (tokens[i].length() == 1 && tokens[i].charAt(0) < 48) {
                int int2 = stack.pop();
                int int1 = stack.pop();
                char operator = tokens[i].charAt(0);
                int result = solve(int2, int1, operator);
                stack.push(result);
            } 
            else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }

    public int solve(int num2,int num1,char op){
        int ans;
        switch(op){
            case '+' :
                ans = num1+num2;
                break;
            case '-' :
                ans =  num1-num2;
                break;
            case '*' :
                ans = num1*num2;
                break;
            case '/' :
                ans = num1/num2;
                break;
            default :
                ans = 0;
                break;
        }
        return ans;
    }
}
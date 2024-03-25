class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray())
        {
            else if(c == '(')
            {
                stack.push(')');
            }
            else if(c == '[')
            {
                stack.push(']');
            }
            else if(c == '{')
            {
                stack.push('}');
            }
            if(stack.isEmpty() || stack.pop() != c)
            {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
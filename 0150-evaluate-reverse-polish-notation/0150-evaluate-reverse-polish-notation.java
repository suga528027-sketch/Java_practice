class Solution {
    public int evalRPN(String[] tokens) {
        int result = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s :tokens)
        {
            switch(s)
            {
                case "+":
                {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1 + num2);
                    break;
                }
                case "-":
                {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 - num1);
                    break;
                }
                case "/":
                {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num2 / num1);
                    break;
                }
                case "*":
                {
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1 * num2);
                    break;
                }
                default :
                {
                    stack.push(Integer.parseInt(s));
                    break;
                }
            }
        }
        return stack.peek();
    }
}
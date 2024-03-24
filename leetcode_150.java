import java.util.Stack;

class leetcode_150 {
    public int evalRPN(String[] tokens) {   
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("*") || token.equals("/") || token.equals("-")) {
                int y = stack.pop();
                int x = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(x + y);
                        break;
                    case "-":
                        stack.push(x - y);
                        break;
                    case "*":
                        stack.push(x * y);
                        break;
                    case "/":
                        stack.push(x / y); 
                       break;
                }
            } else {
                stack.push(Integer.parseInt(token));    
            }
        }
        
        return stack.pop();
    }
    public int evalRPN2(String[] tokens) {// EFFI
        Stack<Integer> stack = new Stack<>();
        
        for (String token : tokens) {
            char c = token.charAt(0);
            if (Character.isDigit(c) || (token.length() > 1 && c == '-')) {
                stack.push(Integer.parseInt(token));
            } else {
                int y = stack.pop();
                int x = stack.pop();
                if (c == '+') {
                    stack.push(x + y);
                } else if (c == '-') {
                    stack.push(x - y);
                } else if (c == '*') {
                    stack.push(x * y);
                } else if (c == '/') {
                    if (y != 0) {
                        stack.push(x / y);  
                    } else {
                        throw new ArithmeticException("Division by zero");
                    }
                }
            }
        }
        
        return stack.pop();
    }
    public static void main(String[] args) {
        leetcode_150 obj=new leetcode_150();
        String [] str={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println( obj.evalRPN(str));
        }
}

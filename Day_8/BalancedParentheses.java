package Day_8;

import java.util.Stack;

public class BalancedParentheses {
    public static void main(String[] args) {
        String expression = "(a+b) * (c-d)";
        System.out.println("Expression: " + expression);

        if (isBalanced(expression)) {
            System.out.println("Valid expression");
        } else {
            System.out.println("Invalid expression");
        }
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();
        for (char ch : expr.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}

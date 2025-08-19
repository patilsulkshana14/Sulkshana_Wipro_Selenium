package Day_8;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println("Original Stack: " + stack);

        int popped = stack.pop();
        System.out.println("After pop (removed " + popped + "): " + stack);

        int top = stack.peek();
        System.out.println("Current top: " + top);

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

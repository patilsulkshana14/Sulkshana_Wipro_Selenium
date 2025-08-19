package Day_8;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo3 {
    public static void main(String[] args) {
        Deque<String> backStack = new LinkedList<>();
        Deque<String> forwardStack = new LinkedList<>();

        backStack.push("Page1");
        backStack.push("Page2");
        backStack.push("Page3");

        System.out.println("Back Stack (Original): " + backStack);
        System.out.println("Forward Stack (Original): " + forwardStack);

        String current = backStack.pop();
        forwardStack.push(current);
        System.out.println("After Going Back:");
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);

        current = forwardStack.pop();
        backStack.push(current);
        System.out.println("After Going Forward:");
        System.out.println("Back Stack: " + backStack);
        System.out.println("Forward Stack: " + forwardStack);
    }
}

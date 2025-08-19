package Day_8;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo2 {
    public static void main(String[] args) {
        Deque<String> orders = new LinkedList<>();

        orders.addFirst("Order1");
        orders.addLast("Order2");
        orders.addFirst("Order3");
        orders.addLast("Order4");

        System.out.println("Original Orders: " + orders);

        orders.removeFirst();
        System.out.println("After Removing First: " + orders);

        orders.removeLast();
        System.out.println("After Removing Last: " + orders);
    }
}

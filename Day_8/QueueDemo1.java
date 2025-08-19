package Day_8;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo1 {
    public static void main(String[] args) {
        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.add("Customer1");
        bankQueue.add("Customer2");
        bankQueue.add("Customer3");
        bankQueue.add("Customer4");
        bankQueue.add("Customer5");

        System.out.println("Original Queue: " + bankQueue);

        while (!bankQueue.isEmpty()) {
            System.out.println("Serving: " + bankQueue.poll());
            System.out.println("Updated Queue: " + bankQueue);
        }
    }
}
